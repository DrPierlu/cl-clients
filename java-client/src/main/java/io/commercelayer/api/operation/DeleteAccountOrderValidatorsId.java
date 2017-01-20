package io.commercelayer.api.operation;

import io.commercelayer.api.model.OrderValidator;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountOrderValidatorsId
 */
public class DeleteAccountOrderValidatorsId extends DeleteOperation<OrderValidator> {

	public static final String OPERATION_PATH = "/account/order_validators/{id}";


	public DeleteAccountOrderValidatorsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountOrderValidatorsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<OrderValidator> getResourceType() {
		return OrderValidator.class;
	}
	
}
