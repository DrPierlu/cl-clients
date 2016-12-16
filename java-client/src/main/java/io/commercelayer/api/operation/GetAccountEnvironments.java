package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAccountEnvironments
 */
public class GetAccountEnvironments extends SearchOperation {

	public static final String OPERATION_PATH = "/account/environments";


	public GetAccountEnvironments() {
		super(OPERATION_PATH);
	}
	
}
