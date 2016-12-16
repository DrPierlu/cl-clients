package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountUsersId
 */
public class PutAccountUsersId extends PutOperation {

	public static final String OPERATION_PATH = "/account/users/{id}";


	public PutAccountUsersId() {
		super(OPERATION_PATH);
	}
	
}
