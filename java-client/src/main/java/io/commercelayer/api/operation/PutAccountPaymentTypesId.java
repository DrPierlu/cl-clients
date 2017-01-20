package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaymentType;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountPaymentTypesId
 */
public class PutAccountPaymentTypesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/payment_types/{id}";


	{
		addRequiredField("name");
		addRequiredField("merchantId");
		addRequiredField("gatewayId");
		addRequiredField("description");
		addRequiredField("id");
	}


	public PutAccountPaymentTypesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountPaymentTypesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return PaymentType.class;
	}
	
}
