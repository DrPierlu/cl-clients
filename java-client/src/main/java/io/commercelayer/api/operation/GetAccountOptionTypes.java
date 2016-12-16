package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAccountOptionTypes
 */
public class GetAccountOptionTypes extends SearchOperation {

	public static final String OPERATION_PATH = "/account/option_types";


	public GetAccountOptionTypes() {
		super(OPERATION_PATH);
	}
	
}
