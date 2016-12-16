package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAccountUsers
 */
public class GetAccountUsers extends SearchOperation {

	public static final String OPERATION_PATH = "/account/users";


	public GetAccountUsers() {
		super(OPERATION_PATH);
	}
	
}
