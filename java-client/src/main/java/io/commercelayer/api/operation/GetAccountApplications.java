package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountApplications
 */
public class GetAccountApplications extends SearchOperation {

	public static final String OPERATION_PATH = "/account/applications";


	public GetAccountApplications() {
		super(OPERATION_PATH);
	}
	
}
