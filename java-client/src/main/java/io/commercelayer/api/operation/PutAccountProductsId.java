package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountProductsId
 */
public class PutAccountProductsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/products/{id}";


	{
		addRequiredField("name");
		addRequiredField("productTypeId");
		addRequiredField("description");
		addRequiredField("taxCode");
		addRequiredField("trackInventory");
		addRequiredField("id");
	}

	public PutAccountProductsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountProductsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
