package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountProducts
 */
public class PostAccountProducts extends PostOperation {

	public static final String OPERATION_PATH = "/account/products";


	{
		addRequiredField("name");
		addRequiredField("productTypeId");
		addRequiredField("description");
		addRequiredField("taxCode");
		addRequiredField("trackInventory");
	}

	public PostAccountProducts() {
		super(OPERATION_PATH);
	}
	
}
