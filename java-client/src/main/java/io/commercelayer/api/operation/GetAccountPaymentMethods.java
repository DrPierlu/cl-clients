package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaymentMethod;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountPaymentMethods
 */
public class GetAccountPaymentMethods extends SearchOperation<PaymentMethod> {

	public static final String OPERATION_PATH = "/account/payment_methods";


	public GetAccountPaymentMethods() {
		super(OPERATION_PATH);
	}
	

	public Class<PaymentMethod> getResourceType() {
		return PaymentMethod.class;
	}
	
}
