package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAccountRoles
 */
public class GetAccountRoles extends SearchOperation {

	public static final String OPERATION_PATH = "/account/roles";


	public GetAccountRoles() {
		super(OPERATION_PATH);
	}
	
}
