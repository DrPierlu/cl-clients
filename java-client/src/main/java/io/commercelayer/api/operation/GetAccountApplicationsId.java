package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;

/**
 * GetAccountApplicationsId
 */
public class GetAccountApplicationsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/applications/{id}";


	public GetAccountApplicationsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountApplicationsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
