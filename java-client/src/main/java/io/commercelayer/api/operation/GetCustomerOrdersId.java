package io.commercelayer.api.operation;

import io.commercelayer.api.model.Order;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetCustomerOrdersId
 */
public class GetCustomerOrdersId extends GetIdOperation<Order> {

	public static final String OPERATION_PATH = "/customer/orders/{id}";


	public GetCustomerOrdersId() {
		super(OPERATION_PATH);
	}
	

	public GetCustomerOrdersId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Order> getResourceType() {
		return Order.class;
	}
	
}
