package io.commercelayer.api.operation;

import io.commercelayer.api.model.OrderValidator;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountOrderValidators
 */
public class GetAccountOrderValidators extends SearchOperation<OrderValidator> {

	public static final String OPERATION_PATH = "/account/order_validators";


	public GetAccountOrderValidators() {
		super(OPERATION_PATH);
	}
	

	public Class<OrderValidator> getResourceType() {
		return OrderValidator.class;
	}
	
}
