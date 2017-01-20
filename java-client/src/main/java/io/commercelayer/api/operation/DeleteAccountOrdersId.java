package io.commercelayer.api.operation;

import io.commercelayer.api.model.Order;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountOrdersId
 */
public class DeleteAccountOrdersId extends DeleteOperation<Order> {

	public static final String OPERATION_PATH = "/account/orders/{id}";


	public DeleteAccountOrdersId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountOrdersId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Order> getResourceType() {
		return Order.class;
	}
	
}
