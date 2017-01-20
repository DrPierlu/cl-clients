package io.commercelayer.api.operation;

import io.commercelayer.api.model.Customer;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountCustomers
 */
public class GetAccountCustomers extends SearchOperation<Customer> {

	public static final String OPERATION_PATH = "/account/customers";


	public GetAccountCustomers() {
		super(OPERATION_PATH);
	}
	

	public Class<Customer> getResourceType() {
		return Customer.class;
	}
	
}
