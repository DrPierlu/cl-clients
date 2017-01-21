package io.commercelayer.api;

import java.util.List;
import java.util.Map;

import io.commercelayer.api.config.ApiConfig;
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
import io.commercelayer.api.json.JsonCodecFactory;
import io.commercelayer.api.model.common.ApiError;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.ApiOperation;
import io.commercelayer.api.operation.common.DeleteOperation;
import io.commercelayer.api.operation.common.GetIdOperation;
import io.commercelayer.api.operation.common.MoveOperation;
import io.commercelayer.api.operation.common.PayloadOperation;
import io.commercelayer.api.operation.common.PostOperation;
import io.commercelayer.api.operation.common.PutOperation;
import io.commercelayer.api.operation.common.SearchOperation;
import io.commercelayer.api.search.ApiSearchRequest;
import io.commercelayer.api.search.ApiSearchResponse;
import io.commercelayer.api.search.PageFilter;
import io.commercelayer.api.search.PaginatedResponse;
import io.commercelayer.api.search.PaginatedResponse.PaginationInfo;
import io.commercelayer.api.search.SearchFilter;
import io.commercelayer.api.search.SearchParam;
import io.commercelayer.api.search.SortFilter;
import io.commercelayer.api.search.SortParam;
import io.commercelayer.api.security.ApiToken;
import io.commercelayer.api.util.ApiUtils;

public class ApiCaller extends ApiConnector {

	private ApiToken apiToken;
	
	public ApiCaller(ApiToken apiToken) {
		super();
		this.apiToken = apiToken;
	}

	public ApiCaller(ApiToken apiToken, HttpClient httpClient) {
		this.apiToken = apiToken;
		useHttpClient((httpClient == null) ? HttpClientFactory.getHttpClientInstance() : httpClient);
		useJsonCodec(JsonCodecFactory.getJsonCodecInstance());
	}

	public void setCustomHttpClient(HttpClient httpClient) {
		if (httpClient != null) useHttpClient(httpClient);
		else logger.error("Custom HttpClient implementation required");
	}
	

	void useToken(ApiToken token) {
		this.apiToken = token;
	}
	
	public <T extends ApiResource, O extends MoveOperation<T>> ApiResponse<T> move(ApiRequest<O> apiRequest) throws ApiException, AuthException {
		return get(apiRequest);
	}
	
	
	public <T extends ApiResource, O extends GetIdOperation<T>> ApiResponse<T> get(ApiRequest<O> apiRequest) throws ApiException, AuthException {

		final GetIdOperation<T> operation = apiRequest.getOperation();
		
		logger.info("{} execution [{}, {}]", operation.getMethod(), operation.getPath(), operation.getId());

		HttpRequest request = createHttpRequest(operation);

		ApiResponse<T> apiResponse = null;
		
		HttpResponse response = call(request);
		T resourceObject = null;
		if (operation.getResourceType() != null) resourceObject = jsonCodec.fromJSON(response.getBody(), operation.getResourceType());
		apiResponse = new ApiResponse<>(resourceObject);
		
		
		return apiResponse;

	}

	
	public <T extends ApiResource, O extends PutOperation<T>> ApiResponse<T> put(ApiRequest<O> apiRequest) throws ApiException, AuthException {
		
		final PutOperation<T> operation = apiRequest.getOperation();

		logger.info("{} execution: {} {}", operation.getMethod(), operation.getPath(), operation.getPayload());

		HttpRequest request = createHttpRequest(operation);
		if ((operation instanceof PayloadOperation) && (operation.getPayload() != null))
			request.setBody(jsonCodec.toJSON(operation.getPayload(), true));

		ApiResponse<T> apiResponse = null;
		
		HttpResponse response = call(request);
		T resourceObject = null;
		if (operation.getResourceType() != null) resourceObject = jsonCodec.fromJSON(response.getBody(), operation.getResourceType());
		apiResponse = new ApiResponse<>(resourceObject);
		
		
		return apiResponse;

	}


	public <T extends ApiResource, O extends PostOperation<T>> ApiResponse<T> post(ApiRequest<O> apiRequest) throws ApiException, AuthException {

		final PostOperation<T> operation = apiRequest.getOperation();
		
		logger.info("{} execution: {} {}", operation.getMethod(), operation.getPath(), operation.getPayload());

		HttpRequest request = createHttpRequest(operation);
		if ((operation instanceof PayloadOperation) && (operation.getPayload() != null))
			request.setBody(jsonCodec.toJSON(operation.getPayload(), true));

		ApiResponse<T> apiResponse = null;
		
		HttpResponse response = call(request);
		T resourceObject = null;
		if (operation.getResourceType() != null) resourceObject = jsonCodec.fromJSON(response.getBody(), operation.getResourceType());
		apiResponse = new ApiResponse<>(resourceObject);
		
		
		return apiResponse;

	}

	
	public <T extends ApiResource, O extends DeleteOperation<T>> ApiResponse<T> delete(ApiRequest<O> apiRequest) throws ApiException, AuthException {
		
		final DeleteOperation<T> operation = apiRequest.getOperation();

		logger.info("{} execution: {} [{}]", operation.getMethod(), operation.getPath(), operation.getId());

		HttpRequest request = createHttpRequest(operation);
		
		ApiResponse<T> apiResponse = null;

		HttpResponse response = call(request);
		apiResponse = new ApiResponse<>((T)null);
		if (response.getCode() != 204) logger.warn("{}: Unexpected HTTP Code [{}]", operation.getMethod(), response.getCode());
		if (response.getBody() != null) logger.warn("{}: Unexpected Response Body", operation.getMethod());
		
		
		return apiResponse;

	}
	
	
	public <T extends ApiResource> ApiSearchResponse<T> search(ApiSearchRequest<T> searchRequest) throws ApiException, AuthException {

		final SearchOperation<T> operation = searchRequest.getOperation();
		
		logger.info("GET[search] execution [{}]", operation.getPath(), searchRequest.getOperation().getResourceType());
		
		HttpRequest request = createHttpRequest(operation);

		setRequestFilters(request, operation);

		ApiSearchResponse<T> searchResponse = null;
		
		HttpResponse response = call(request);
		List<T> itemList = jsonCodec.fromJSONList(response.getBody(), searchRequest.getOperation().getResourceType());
		searchResponse = new ApiSearchResponse<>(itemList);
		setResponsePagination(searchResponse, response);
		
		
		return searchResponse;

	}
	
	
	private HttpResponse call(HttpRequest request) throws ConnectionException, SystemException, AuthException, ApiException {

		logger.debug("Request Body: {}", request.getBody());

		HttpResponse response = httpClient.send(request); // Connection Exception
		
		if (ApiConfig.testModeEnabled())
			logger.debug("Response Body: {}", response.getBody());

		if (response.hasErrorCode()) {
			logger.warn("HTTP Response Code: {}", response.getCode());
			try {
				if (response.getCode() >= 500) { // System Error
					throw new SystemException(String.format("Api System Exception [%d] - %s", response.getCode(), response.getBody()), response.getCode());
				}
				else
				if (response.getCode() == 401) { // Authentication Error
					ApiError apiError = jsonCodec.fromJSON(response.getBody(), ApiError.class);
					apiError.setHttpErrorCode(response.getCode());
					throw new AuthException(apiError);
				}
				else
				if (response.getCode() >= 400) { // Data Error
					ApiError apiError = jsonCodec.fromJSON(response.getBody(), ApiError.class);
					apiError.setHttpErrorCode(response.getCode());
					throw new ApiException(apiError);
				}
				else
				if (response.getCode() >= 300) { // Redirection
					// Nothing to do
				}
			}
			catch (SystemException | ApiException e) {
				logger.error("ApiCaller Exception: {}", e.getMessage());
				throw e;
			}
		}
		else {
			// 200 <= Error Code < 300
		}
		

		return response;

	}
	
	
	
	private HttpRequest createHttpRequest(ApiOperation<? extends ApiResource> op) {

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



	private void setRequestFilters(HttpRequest request, SearchOperation<? extends ApiResource> sop) {

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
