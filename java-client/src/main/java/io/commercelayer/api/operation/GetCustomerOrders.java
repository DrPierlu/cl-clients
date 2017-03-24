package io.commercelayer.api.operation;

import io.commercelayer.api.model.Order;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetCustomerOrders
 */
public class GetCustomerOrders extends SearchOperation<Order> {

	public static final String OPERATION_PATH = "/customer/orders";


	public GetCustomerOrders() {
		super(OPERATION_PATH);
	}
	

	public Class<Order> getResourceType() {
		return Order.class;
	}
	
}
