package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountVariants
 */
public class PostAccountVariants extends PostOperation {

	public static final String OPERATION_PATH = "/account/variants";


	{
		addRequiredField("productId");
		addRequiredField("sku");
		addRequiredField("taxCode");
		addRequiredField("trackInventory");
	}


	public PostAccountVariants() {
		super(OPERATION_PATH);
	}
	
}
