package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountGatewaysId
 */
public class PutAccountGatewaysId extends PutOperation {

	public static final String OPERATION_PATH = "/account/gateways/{id}";


	{
		addRequiredField("kind");
		addRequiredField("id");
	}


	public PutAccountGatewaysId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountGatewaysId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
