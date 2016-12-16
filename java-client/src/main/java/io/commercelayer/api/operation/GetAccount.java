package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAccount
 */
public class GetAccount extends SearchOperation {

	public static final String OPERATION_PATH = "/account";


	public GetAccount() {
		super(OPERATION_PATH);
	}
	
}
