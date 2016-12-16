package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAccountPermissions
 */
public class GetAccountPermissions extends SearchOperation {

	public static final String OPERATION_PATH = "/account/permissions";


	public GetAccountPermissions() {
		super(OPERATION_PATH);
	}
	
}
