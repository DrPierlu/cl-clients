package io.commercelayer.api.search;

import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.operation.common.SearchOperation;

public class ApiSearchRequest extends ApiRequest<SearchOperation> {

	public ApiSearchRequest() {
		super();
	}

	public ApiSearchRequest(SearchOperation searchOperation) {
		this();
		setOperation(searchOperation);
	}

}
