package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountApplicationsId
 */
public class PutAccountApplicationsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/applications/{id}";


	public PutAccountApplicationsId() {
		super(OPERATION_PATH);
	}
	
}
