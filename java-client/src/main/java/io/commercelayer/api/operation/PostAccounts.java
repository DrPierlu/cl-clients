package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccounts
 */
public class PostAccounts extends PostOperation {

	public static final String OPERATION_PATH = "/accounts";


	public PostAccounts() {
		super(OPERATION_PATH);
	}
	
}
