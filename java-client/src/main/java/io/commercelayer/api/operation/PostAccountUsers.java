package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountUsers
 */
public class PostAccountUsers extends PostOperation {

	public static final String OPERATION_PATH = "/account/users";


	public PostAccountUsers() {
		super(OPERATION_PATH);
	}
	
}
