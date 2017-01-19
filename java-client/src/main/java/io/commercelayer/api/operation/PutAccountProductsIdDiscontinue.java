package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountProductsIdDiscontinue
 */
public class PutAccountProductsIdDiscontinue extends PutOperation {

	public static final String OPERATION_PATH = "/account/products/{id}/discontinue";


	{
		addRequiredField("id");
	}


	public PutAccountProductsIdDiscontinue() {
		super(OPERATION_PATH);
	}
	

	public PutAccountProductsIdDiscontinue(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
