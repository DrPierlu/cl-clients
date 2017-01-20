package io.commercelayer.api.operation;

import io.commercelayer.api.model.Order;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountOrders
 */
public class GetAccountOrders extends SearchOperation {

	public static final String OPERATION_PATH = "/account/orders";


	public GetAccountOrders() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Order.class;
	}
	
}
