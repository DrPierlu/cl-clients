package io.commercelayer.api.operation;

import io.commercelayer.api.model.Order;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountOrders
 */
public class PostAccountOrders extends PostOperation {

	public static final String OPERATION_PATH = "/account/orders";


	{
		addRequiredField("channelId");
		addRequiredField("countryId");
		addRequiredField("customerId");
	}


	public PostAccountOrders() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Order.class;
	}
	
}
