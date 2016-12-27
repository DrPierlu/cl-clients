package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountPriceLists
 */
public class PostAccountPriceLists extends PostOperation {

	public static final String OPERATION_PATH = "/account/price_lists";


	{
		addRequiredField("currencyId");
		addRequiredField("name");
		addRequiredField("taxIncluded");
	}

	public PostAccountPriceLists() {
		super(OPERATION_PATH);
	}
	
}
