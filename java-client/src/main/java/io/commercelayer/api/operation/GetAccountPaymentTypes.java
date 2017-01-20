package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaymentType;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountPaymentTypes
 */
public class GetAccountPaymentTypes extends SearchOperation {

	public static final String OPERATION_PATH = "/account/payment_types";


	public GetAccountPaymentTypes() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return PaymentType.class;
	}
	
}
