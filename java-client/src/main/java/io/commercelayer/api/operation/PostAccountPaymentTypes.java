package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaymentType;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountPaymentTypes
 */
public class PostAccountPaymentTypes extends PostOperation {

	public static final String OPERATION_PATH = "/account/payment_types";


	{
		addRequiredField("name");
		addRequiredField("merchantId");
		addRequiredField("gatewayId");
		addRequiredField("description");
	}


	public PostAccountPaymentTypes() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return PaymentType.class;
	}
	
}
