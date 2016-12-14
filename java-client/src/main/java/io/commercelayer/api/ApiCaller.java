package io.commercelayer.api;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.commercelayer.api.domain.ContentType;
import io.commercelayer.api.exception.ApiException;
import io.commercelayer.api.exception.AuthException;
import io.commercelayer.api.exception.ConnectionException;
import io.commercelayer.api.exception.SystemException;
import io.commercelayer.api.http.HttpClient;
import io.commercelayer.api.http.HttpClientFactory;
import io.commercelayer.api.http.HttpRequest;
import io.commercelayer.api.http.HttpRequest.Header;
import io.commercelayer.api.http.HttpRequest.Method;
import io.commercelayer.api.http.HttpResponse;
import io.commercelayer.api.http.auth.HttpAuthOAuth2;
import io.commercelayer.api.json.JsonCodec;
import io.commercelayer.api.json.JsonCodecFactory;
import io.commercelayer.api.model.common.ApiError;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.ApiOperation;
import io.commercelayer.api.operation.DeleteOperation;
import io.commercelayer.api.operation.GetOperation;
import io.commercelayer.api.operation.SearchOperation;
import io.commercelayer.api.search.ApiSearchRequest;
import io.commercelayer.api.search.ApiSearchResponse;
import io.commercelayer.api.search.ApiSearchResponse.PaginationInfo;
import io.commercelayer.api.search.PageFilter;
import io.commercelayer.api.search.SearchFilter;
import io.commercelayer.api.search.SearchParam;
import io.commercelayer.api.search.SortFilter;
import io.commercelayer.api.search.SortParam;
import io.commercelayer.api.security.ApiToken;
import io.commercelayer.api.util.ApiUtils;
import io.commercelayer.api.util.LogUtils;

public abstract class ApiCaller {

	protected final Logger logger = LoggerFactory.getLogger(getClass());

	private final ApiToken apiToken;

	private HttpClient httpClient;
	private final JsonCodec jsonCodec;

	// protected abstract String getResourcePath();

	public ApiCaller(ApiToken apiToken) {
		this.apiToken = apiToken;
		this.httpClient = HttpClientFactory.getHttpClientInstance();
		this.jsonCodec = JsonCodecFactory.getJsonCodecInstance();
	}

	public ApiCaller(ApiToken apiToken, HttpClient httpClient) {
		this.apiToken = apiToken;
		this.httpClient = (httpClient == null) ? HttpClientFactory.getHttpClientInstance() : httpClient;
		this.jsonCodec = JsonCodecFactory.getJsonCodecInstance();
	}

	public void setCustomHttpClient(HttpClient httpClient) {
		if (httpClient != null)
			this.httpClient = httpClient;
		else
			logger.error("Custom HttpClient implementation required");
	}

	protected <T extends ApiResource> ApiSearchResponse<T> getItemList(ApiSearchRequest searchRequest, Class<T> class_) throws ApiException {

		HttpRequest request = createHttpRequest(searchRequest, Method.GET);

		// Pagination Filter
		final PageFilter pageFilter = searchRequest.getPageFilter();
		if (pageFilter != null) {
			if (pageFilter.getPage() != null)
				request.addQueryStringParam(PageFilter.Params.PAGE, pageFilter.getPage());
			if (pageFilter.getPerPage() != null)
				request.addQueryStringParam(PageFilter.Params.PER_PAGE, pageFilter.getPerPage());
			if (pageFilter.getOffset() != null)
				request.addQueryStringParam(PageFilter.Params.OFFSET, pageFilter.getOffset());
		}

		// Search Filter
		final SearchFilter searchFilter = searchRequest.getSearchFilter();
		if ((searchFilter != null) && (searchFilter.getSearchParams() != null)) {
			for (SearchParam sp : searchFilter.getSearchParams()) {
				StringBuilder q = new StringBuilder();
				q.append("q[").append(sp.getField()).append('_').append(sp.getType().operation()).append(']');
				request.addQueryStringParam(q.toString(), sp.getValue());
			}
		}

		// Sort Filter
		final SortFilter sortFilter = searchRequest.getSortFilter();
		if (sortFilter != null) {
			for (SortParam sp : sortFilter.getSortParams()) {
				StringBuilder v = new StringBuilder();
				v.append(sp.getField()).append("+").append(sp.getType().order());
				request.addQueryStringParam("q[s]", v.toString());
			}
		}

		// HTTP server call
		HttpResponse response = call(request);

		List<T> itemList = jsonCodec.fromJSONList(response.getBody(), class_);

		ApiSearchResponse<T> searchResponse = new ApiSearchResponse<>(itemList);

		// Pagination Response
		PaginationInfo pageInfo = new PaginationInfo();

		pageInfo.setNextPage(response.getHeaderInt(PaginationInfo.Params.NEXT_PAGE));
		pageInfo.setOffset(response.getHeaderInt(PaginationInfo.Params.OFFSET));
		pageInfo.setPage(response.getHeaderInt(PaginationInfo.Params.PAGE));
		pageInfo.setPerPage(response.getHeaderInt(PaginationInfo.Params.PER_PAGE));
		pageInfo.setPrevPage(response.getHeaderInt(PaginationInfo.Params.PREV_PAGE));
		pageInfo.setTotal(response.getHeaderInt(PaginationInfo.Params.TOTAL));
		pageInfo.setTotalPages(response.getHeaderInt(PaginationInfo.Params.TOTAL_PAGES));

		searchResponse.setPaginationInfo(pageInfo);

		return searchResponse;

	}

	protected <T extends ApiResource> T getItem(ApiRequest apiRequest, Class<T> class_) throws ApiException {

		logger.info("getItem execution [{}, {}]", apiRequest.getResource().getId(), class_.getName());

		HttpRequest request = createHttpRequest(apiRequest, Method.GET);
		request.setUrl(request.getUrl().concat("/").concat(String.valueOf(apiRequest.getResource().getId())));

		HttpResponse response = call(request);

		T responseBody = jsonCodec.fromJSON(response.getBody(), class_);

		return responseBody;

	}

	protected ApiResource updateItem(ApiRequest apiRequest) throws ApiException {

		logger.info("updateItem execution: {}", apiRequest.getResource());

		HttpRequest request = createHttpRequest(apiRequest, Method.PUT);
		request.setUrl(request.getUrl().concat("/").concat(String.valueOf(apiRequest.getResource().getId())));

		request.setBody(jsonCodec.toJSON(apiRequest.getResource(), true));

		HttpResponse response = call(request);

		ApiResource resourceObject = jsonCodec.fromJSON(response.getBody(), apiRequest.getResource().getClass());

		return resourceObject;

	}

	protected ApiResource insertItem(ApiRequest apiRequest) throws ApiException {

		logger.info("insertItem execution: {}", apiRequest.getResource());

		HttpRequest request = createHttpRequest(apiRequest, Method.POST);

		request.setBody(jsonCodec.toJSON(apiRequest.getResource(), true));

		HttpResponse response = call(request);

		ApiResource resourceObject = jsonCodec.fromJSON(response.getBody(), apiRequest.getResource().getClass());

		return resourceObject;

	}

	protected void deleteItem(ApiRequest apiRequest) throws ApiException {

		logger.info("deleteItem execution: {}", apiRequest.getResource().getId());

		HttpRequest request = createHttpRequest(apiRequest, Method.DELETE);
		request.setUrl(request.getUrl().concat("/").concat(String.valueOf(apiRequest.getResource().getId())));

		/* HttpResponse response = */call(request);

	}

	private HttpResponse call(HttpRequest request) throws ConnectionException, ApiException, AuthException, SystemException {

		if ((apiToken == null) || apiToken.getAccessToken() == null)
			throw new AuthException("No access_token defined");

		HttpResponse response = null;

		logger.trace("Request Body: {}", request.getBody());

		response = httpClient.send(request); // Connection Exception

		logger.debug("HTTP Response Code: {}", response.getCode());

		if (response.hasErrorCode()) {
			if (response.getCode() <= 308) { // Redirection
				// Nothing to do
			} else if (response.getCode() == 401) { // Authentication Error
				ApiError apiError = jsonCodec.fromJSON(response.getBody(), ApiError.class);
				throw new AuthException(apiError);
			} else if (response.getCode() == 400) { // Data Error
				ApiError apiError = jsonCodec.fromJSON(response.getBody(), ApiError.class);
				throw new ApiException(apiError);
			} else if (response.getCode() >= 500) { // System Error
				throw new SystemException(String.format("Api System Exception [%d]", response.getCode()));
			}
		}

		// logger.trace("Response Body: {}", ApiConfig.testModeEnabled()?
		// ApiUtils.formatJson(response.getBody()) : response.getBody());
		logger.trace("Response Body: {}", response.getBody());

		return response;

	}

	private HttpRequest createHttpRequest(ApiRequest apiRequest, Method httpMethod) {

		HttpRequest request = new HttpRequest(httpMethod);

		String url = ApiUtils.getResourceUrl(apiRequest.getPath());

		int cbIdx = -1;
		while ((cbIdx = url.indexOf("{")) >= 0) {

			String fieldName = url.substring(cbIdx, url.indexOf('}'));
			String fieldValue = null;

			try {
				Field field = apiRequest.getClass().getField(fieldName);
				field.setAccessible(true);
				fieldValue = String.valueOf(field.get(apiRequest.getResource()));
			} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
				logger.warn(LogUtils.printStackTrace(e));
			}

			url = url.replaceFirst("{[a-zA-Z0-9]+}", fieldValue);

		}

		request.setUrl(url);
		request.setContentType(ContentType.JSON);
		request.addHeader(Header.ACCEPT, ContentType.JSON);
		request.setHttpAuth(new HttpAuthOAuth2(apiToken.getAccessToken()));

		return request;

	}

	public void delete(DeleteOperation op) throws ApiException {

		logger.info("delete execution: {} [{}]", op.getPath(), op.getId());

		HttpRequest request = createHttpRequest(op);

		/* HttpResponse response = */call(request);

	}

	protected <T extends ApiResource> T get(GetOperation<T> op) throws ApiException {

		logger.info("getItem execution [{}, {}]", op.getId(), op.getResponseObjectType());

		HttpRequest request = createHttpRequest(op);

		HttpResponse response = call(request);

		T responseBody = jsonCodec.fromJSON(response.getBody(), op.getResponseObjectType());

		return responseBody;

	}

	public <T extends ApiResource> ApiSearchResponse<T> get(SearchOperation<T> op) throws ApiException {

		HttpRequest request = createHttpRequest(op);

		setRequestFilters(request, (FilteredCall) op);

		// HTTP server call
		HttpResponse response = call(request);

		List<T> itemList = jsonCodec.fromJSONList(response.getBody(), op.getResponseObjectType());

		ApiSearchResponse<T> searchResponse = new ApiSearchResponse<>(itemList);

		setResponsePagination(searchResponse, response);
		
		
		return searchResponse;

	}
	

	private HttpRequest createHttpRequest(ApiOperation op) {

		HttpRequest request = new HttpRequest(op.getMethod());

		String path = op.getPath();
		for (Map.Entry<String, Object> param : op.getPathParams().entrySet()) {
			path = path.replaceAll(String.format("\\{%s\\}", param.getKey()), String.valueOf(param.getValue()));
		}

		request.setUrl(ApiUtils.getResourceUrl(path));

		request.setContentType(ContentType.JSON);
		request.addHeader("Accept", ContentType.JSON);
		request.setHttpAuth(new HttpAuthOAuth2(apiToken.getAccessToken()));

		return request;

	}

	private void setRequestFilters(HttpRequest request, FilteredCall fc) {

		// Pagination Filter
		final PageFilter pageFilter = fc.getPageFilter();
		if (pageFilter != null) {
			if (pageFilter.getPage() != null)
				request.addQueryStringParam("page", pageFilter.getPage());
			if (pageFilter.getPerPage() != null)
				request.addQueryStringParam("per_page", pageFilter.getPerPage());
			if (pageFilter.getOffset() != null)
				request.addQueryStringParam("offset", pageFilter.getOffset());
		}

		// Search Filter
		final SearchFilter searchFilter = fc.getSearchFilter();
		if ((searchFilter != null) && (searchFilter.getSearchParams() != null)) {
			for (SearchParam sp : searchFilter.getSearchParams()) {
				StringBuilder q = new StringBuilder();
				q.append("q[").append(sp.getField()).append('_').append(sp.getType().operation()).append(']');
				request.addQueryStringParam(q.toString(), sp.getValue());
			}
		}

		// Sort Filter
		final SortFilter sortFilter = fc.getSortFilter();
		if (sortFilter != null) {
			for (SortParam sp : sortFilter.getSortParams()) {
				StringBuilder v = new StringBuilder();
				v.append(sp.getField()).append("+").append(sp.getType().order());
				request.addQueryStringParam("q[s]", v.toString());
			}
		}

	}

	private void setResponsePagination(PaginatedResponse pr, HttpResponse response) {

		// Pagination Response
		PaginationInfo pageInfo = new PaginationInfo();

		pageInfo.setNextPage(response.getHeaderInt("X-Next-Page"));
		pageInfo.setOffset(response.getHeaderInt("X-Offset"));
		pageInfo.setPage(response.getHeaderInt("X-Page"));
		pageInfo.setPerPage(response.getHeaderInt("X-Per-Page"));
		pageInfo.setPrevPage(response.getHeaderInt("X-Prev-Page"));
		pageInfo.setTotal(response.getHeaderInt("X-Total"));
		pageInfo.setTotalPages(response.getHeaderInt("X-Total-Pages"));

		pr.setPaginationInfo(pageInfo);

	}

}
