package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountRolesId
 */
public class PutAccountRolesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/roles/{id}";


	public PutAccountRolesId() {
		super(OPERATION_PATH);
	}
	
}
