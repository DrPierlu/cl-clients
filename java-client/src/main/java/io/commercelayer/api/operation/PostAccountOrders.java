package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountOrders
 */
public class PostAccountOrders extends PostOperation {

	public static final String OPERATION_PATH = "/account/orders";


	{
		addRequiredField("channelId");
		addRequiredField("countryId");
	}


	public PostAccountOrders() {
		super(OPERATION_PATH);
	}
	
}
