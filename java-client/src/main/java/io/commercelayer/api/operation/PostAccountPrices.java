package io.commercelayer.api.operation;

import io.commercelayer.api.model.Price;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountPrices
 */
public class PostAccountPrices extends PostOperation<Price> {

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
	

	public Class<Price> getResourceType() {
		return Price.class;
	}
	
}
