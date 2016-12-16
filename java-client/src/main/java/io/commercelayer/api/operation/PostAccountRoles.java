package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountRoles
 */
public class PostAccountRoles extends PostOperation {

	public static final String OPERATION_PATH = "/account/roles";


	public PostAccountRoles() {
		super(OPERATION_PATH);
	}
	
}
