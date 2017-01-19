package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountOrdersIdTaxes
 */
public class PutAccountOrdersIdTaxes extends PutOperation {

	public static final String OPERATION_PATH = "/account/orders/{id}/taxes";


	{
		addRequiredField("id");
	}


	public PutAccountOrdersIdTaxes() {
		super(OPERATION_PATH);
	}
	

	public PutAccountOrdersIdTaxes(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
