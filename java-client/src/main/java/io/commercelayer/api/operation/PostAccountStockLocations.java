package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountStockLocations
 */
public class PostAccountStockLocations extends PostOperation {

	public static final String OPERATION_PATH = "/account/stock_locations";


	{
		addRequiredField("name");
		addRequiredField("addressId");
	}


	public PostAccountStockLocations() {
		super(OPERATION_PATH);
	}
	
}
