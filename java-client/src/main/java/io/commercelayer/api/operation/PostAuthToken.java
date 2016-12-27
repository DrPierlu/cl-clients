package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAuthToken
 */
public class PostAuthToken extends PostOperation {

	public static final String OPERATION_PATH = "/auth/token";


	{
		
	}

	public PostAuthToken() {
		super(OPERATION_PATH);
	}
	
}
