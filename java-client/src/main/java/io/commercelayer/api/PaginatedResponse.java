package io.commercelayer.api;

import io.commercelayer.api.search.ApiSearchResponse.PaginationInfo;

public interface PaginatedResponse {

	PaginationInfo getPaginationInfo();
	
	void setPaginationInfo(PaginationInfo pInfo);
	
}
