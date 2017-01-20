package io.commercelayer.api.operation;

import io.commercelayer.api.model.OrderValidator;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountOrderValidatorsId
 */
public class PutAccountOrderValidatorsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/order_validators/{id}";


	{
		addRequiredField("currencyCode");
		addRequiredField("orderTotalMin");
		addRequiredField("orderTotalMax");
		addRequiredField("orderItemsMin");
		addRequiredField("orderItemsMax");
		addRequiredField("paymentMethodAction");
		addRequiredField("paymentMethodRequiredPercentage");
		addRequiredField("id");
	}


	public PutAccountOrderValidatorsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountOrderValidatorsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return OrderValidator.class;
	}
	
}
