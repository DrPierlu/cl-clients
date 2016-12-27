package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountOrderValidators
 */
public class PostAccountOrderValidators extends PostOperation {

	public static final String OPERATION_PATH = "/account/order_validators";


	{
		addRequiredField("currencyCode");
		addRequiredField("orderTotalMin");
		addRequiredField("orderTotalMax");
		addRequiredField("orderItemsMin");
		addRequiredField("orderItemsMax");
		addRequiredField("paymentMethodAction");
		addRequiredField("paymentMethodRequiredPercentage");
	}


	public PostAccountOrderValidators() {
		super(OPERATION_PATH);
	}
	
}
