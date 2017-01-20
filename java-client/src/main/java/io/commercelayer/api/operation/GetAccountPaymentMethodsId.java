package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaymentMethod;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountPaymentMethodsId
 */
public class GetAccountPaymentMethodsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/payment_methods/{id}";


	public GetAccountPaymentMethodsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountPaymentMethodsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return PaymentMethod.class;
	}
	
}
