package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountPermissionsId
 */
public class PutAccountPermissionsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/permissions/{id}";


	public PutAccountPermissionsId() {
		super(OPERATION_PATH);
	}
	
}
