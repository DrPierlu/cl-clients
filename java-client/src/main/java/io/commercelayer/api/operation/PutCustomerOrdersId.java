package io.commercelayer.api.operation;

import io.commercelayer.api.model.Order;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutCustomerOrdersId
 */
public class PutCustomerOrdersId extends PutOperation<Order> {

	public static final String OPERATION_PATH = "/customer/orders/{id}";


	{
		
	}


	public PutCustomerOrdersId() {
		super(OPERATION_PATH);
	}
	

	public PutCustomerOrdersId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Order> getResourceType() {
		return Order.class;
	}
	
}
