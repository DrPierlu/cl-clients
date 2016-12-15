package io.commercelayer.api;

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
import io.commercelayer.api.http.HttpResponse;
import io.commercelayer.api.http.auth.HttpAuthOAuth2;
import io.commercelayer.api.json.JsonCodec;
import io.commercelayer.api.json.JsonCodecFactory;
import io.commercelayer.api.model.common.ApiError;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.ApiOperation;
import io.commercelayer.api.operation.common.DeleteOperation;
import io.commercelayer.api.operation.common.GetIdOperation;
import io.commercelayer.api.operation.common.PostOperation;
import io.commercelayer.api.operation.common.PutOperation;
import io.commercelayer.api.operation.common.SearchOperation;
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

public class ApiCaller {

	private static final Logger logger = LoggerFactory.getLogger(ApiCaller.class);

	private final ApiToken apiToken;

	private HttpClient httpClient;
	private final JsonCodec jsonCodec;

	
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

	
	public <T extends ApiResource> ApiResponse<T> get(ApiRequest<GetIdOperation> apiRequest, Class<T> returnType) throws ApiException {

		final GetIdOperation operation = apiRequest.getOperation();
		
		logger.info("get execution [{}, {}]", operation.getPath(), operation.getId());

		HttpRequest request = createHttpRequest(operation);

		HttpResponse response = call(request);

		T responseBody = jsonCodec.fromJSON(response.getBody(), returnType);
		
		ApiResponse<T> apiResponse = new ApiResponse<>(responseBody);

		return apiResponse;

	}
	
	public <T extends ApiResource> ApiSearchResponse<T> search(ApiSearchRequest searchRequest, Class<T> returnType) throws ApiException {

		final SearchOperation operation = searchRequest.getOperation();
		
		logger.info("search execution [{}, {}]", operation.getPath(), returnType.getSimpleName());
		
		HttpRequest request = createHttpRequest(operation);

		setRequestFilters(request, operation);

		// HTTP server call
		HttpResponse response = call(request);

		List<T> itemList = jsonCodec.fromJSONList(response.getBody(), returnType);

		ApiSearchResponse<T> searchResponse = new ApiSearchResponse<>(itemList);

		setResponsePagination(searchResponse, response);
		
		return searchResponse;

	}

	
	public <T extends ApiResource> ApiResponse<T> update(ApiRequest<PutOperation> apiRequest, Class<T> returnType) throws ApiException {
		
		final PutOperation operation = apiRequest.getOperation();

		logger.info("update execution: {} {}", operation.getPath(), apiRequest.getResource());

		HttpRequest request = createHttpRequest(operation);
		request.setBody(jsonCodec.toJSON(apiRequest.getResource(), true));

		HttpResponse response = call(request);

		T resourceObject = jsonCodec.fromJSON(response.getBody(), returnType);
		
		ApiResponse<T> apiResponse = new ApiResponse<>(resourceObject);

		return apiResponse;

	}


	public <T extends ApiResource> ApiResponse<T> insert(ApiRequest<PostOperation> apiRequest, Class<T> responseType) throws ApiException {

		final PostOperation operation = apiRequest.getOperation();
		
		logger.info("insert execution: {} {}", operation.getPath(), apiRequest.getResource());

		HttpRequest request = createHttpRequest(operation);
		request.setBody(jsonCodec.toJSON(apiRequest.getResource(), true));

		HttpResponse response = call(request);

		T resourceObject = jsonCodec.fromJSON(response.getBody(), responseType);

		ApiResponse<T> apiResponse = new ApiResponse<>(resourceObject);
		
		return apiResponse;

	}

	
	public void delete(ApiRequest<DeleteOperation> apiRequest) throws ApiException {
		
		final DeleteOperation operation = apiRequest.getOperation();

		logger.info("delete execution: {} [{}]", operation.getPath(), operation.getId());

		HttpRequest request = createHttpRequest(operation);

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
	
	
	private HttpRequest createHttpRequest(ApiOperation op) {

		HttpRequest request = new HttpRequest(op.getMethod());

		String path = op.getPath();
		for (Map.Entry<String, Object> param : op.getPathParams().entrySet()) {
			path = path.replaceAll(String.format("\\{%s\\}", param.getKey()), String.valueOf(param.getValue()));
		}

		request.setUrl(ApiUtils.getResourceUrl(path));

		request.setContentType(ContentType.JSON);
		request.addHeader(Header.ACCEPT, ContentType.JSON);
		request.setHttpAuth(new HttpAuthOAuth2(apiToken.getAccessToken()));

		return request;

	}



	private void setRequestFilters(HttpRequest request, SearchOperation sop) {

		// Pagination Filter
		final PageFilter pageFilter = sop.getPageFilter();
		if (pageFilter != null) {
			if (pageFilter.getPage() != null)
				request.addQueryStringParam("page", pageFilter.getPage());
			if (pageFilter.getPerPage() != null)
				request.addQueryStringParam("per_page", pageFilter.getPerPage());
			if (pageFilter.getOffset() != null)
				request.addQueryStringParam("offset", pageFilter.getOffset());
		}

		// Search Filter
		final SearchFilter searchFilter = sop.getSearchFilter();
		if ((searchFilter != null) && (searchFilter.getSearchParams() != null)) {
			for (SearchParam sp : searchFilter.getSearchParams()) {
				StringBuilder q = new StringBuilder();
				q.append("q[").append(sp.getField()).append('_').append(sp.getType().operation()).append(']');
				request.addQueryStringParam(q.toString(), sp.getValue());
			}
		}

		// Sort Filter
		final SortFilter sortFilter = sop.getSortFilter();
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
