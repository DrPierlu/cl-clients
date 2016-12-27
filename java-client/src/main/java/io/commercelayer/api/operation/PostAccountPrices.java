package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountPrices
 */
public class PostAccountPrices extends PostOperation {

	public static final String OPERATION_PATH = "/account/prices";


	{
		addRequiredField("priceListId");
		addRequiredField("amount");
		addRequiredField("sellableResource");
		addRequiredField("sellableId");
	}


	public PostAccountPrices() {
		super(OPERATION_PATH);
	}
	
}
