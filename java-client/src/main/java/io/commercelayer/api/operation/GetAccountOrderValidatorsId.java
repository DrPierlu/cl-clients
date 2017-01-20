package io.commercelayer.api.operation;

import io.commercelayer.api.model.OrderValidator;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountOrderValidatorsId
 */
public class GetAccountOrderValidatorsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/order_validators/{id}";


	public GetAccountOrderValidatorsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountOrderValidatorsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return OrderValidator.class;
	}
	
}
