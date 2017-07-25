package io.commercelayer.api.operation;

import io.commercelayer.api.model.OrderValidator;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountOrderValidators
 */
public class PostAccountOrderValidators extends PostOperation<OrderValidator> {

	public static final String OPERATION_PATH = "/account/order_validators";


	{
		addRequiredField("currencyCode");
		addRequiredField("orderTotalMin");
		addRequiredField("orderTotalMax");
		addRequiredField("orderItemsMin");
		addRequiredField("orderItemsMax");
		addRequiredField("paymentMethodAction");
		addRequiredField("paymentMethodRequiredPercentage");
		addRequiredField("marketIds");
	}


	public PostAccountOrderValidators() {
		super(OPERATION_PATH);
	}
	

	public Class<OrderValidator> getResourceType() {
		return OrderValidator.class;
	}
	
}
