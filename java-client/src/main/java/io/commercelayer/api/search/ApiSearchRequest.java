package io.commercelayer.api.search;

import io.commercelayer.api.ApiRequest;import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;

public class ApiSearchRequest<T extends ApiResource> extends ApiRequest<SearchOperation<T>> {

	public ApiSearchRequest() {
		super();
	}

	public ApiSearchRequest(SearchOperation<T> searchOperation) {
		this();
		setOperation(searchOperation);
	}

}
