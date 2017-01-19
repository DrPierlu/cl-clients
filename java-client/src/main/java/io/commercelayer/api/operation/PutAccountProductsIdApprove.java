package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountProductsIdApprove
 */
public class PutAccountProductsIdApprove extends PutOperation {

	public static final String OPERATION_PATH = "/account/products/{id}/approve";


	{
		addRequiredField("id");
	}


	public PutAccountProductsIdApprove() {
		super(OPERATION_PATH);
	}
	

	public PutAccountProductsIdApprove(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
