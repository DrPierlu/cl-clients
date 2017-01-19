package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountOrdersIdApprove
 */
public class PutAccountOrdersIdApprove extends PutOperation {

	public static final String OPERATION_PATH = "/account/orders/{id}/approve";


	{
		addRequiredField("id");
	}


	public PutAccountOrdersIdApprove() {
		super(OPERATION_PATH);
	}
	

	public PutAccountOrdersIdApprove(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
