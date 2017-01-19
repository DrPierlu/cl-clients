package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountOrdersIdCancel
 */
public class PutAccountOrdersIdCancel extends PutOperation {

	public static final String OPERATION_PATH = "/account/orders/{id}/cancel";


	{
		addRequiredField("id");
	}


	public PutAccountOrdersIdCancel() {
		super(OPERATION_PATH);
	}
	

	public PutAccountOrdersIdCancel(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
