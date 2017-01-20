package io.commercelayer.api.operation;

import io.commercelayer.api.model.Customer;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountCustomersId
 */
public class DeleteAccountCustomersId extends DeleteOperation<Customer> {

	public static final String OPERATION_PATH = "/account/customers/{id}";


	public DeleteAccountCustomersId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountCustomersId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Customer> getResourceType() {
		return Customer.class;
	}
	
}
