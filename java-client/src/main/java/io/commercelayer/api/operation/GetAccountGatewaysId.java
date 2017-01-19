package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountGatewaysId
 */
public class GetAccountGatewaysId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/gateways/{id}";


	public GetAccountGatewaysId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountGatewaysId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
