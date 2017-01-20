package io.commercelayer.api.operation;

import io.commercelayer.api.model.PaymentMethod;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountPaymentMethodsId
 */
public class DeleteAccountPaymentMethodsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/payment_methods/{id}";


	public DeleteAccountPaymentMethodsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountPaymentMethodsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return PaymentMethod.class;
	}
	
}
