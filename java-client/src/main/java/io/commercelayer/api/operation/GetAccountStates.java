package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountStates
 */
public class GetAccountStates extends SearchOperation {

	public static final String OPERATION_PATH = "/account/states";


	public GetAccountStates() {
		super(OPERATION_PATH);
	}
	
}
