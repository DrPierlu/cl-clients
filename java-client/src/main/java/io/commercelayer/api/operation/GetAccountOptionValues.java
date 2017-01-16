package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountOptionValues
 */
public class GetAccountOptionValues extends SearchOperation {

	public static final String OPERATION_PATH = "/account/option_values";


	public GetAccountOptionValues() {
		super(OPERATION_PATH);
	}
	
}
