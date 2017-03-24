package io.commercelayer.api.operation;

import io.commercelayer.api.model.Customer;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountCustomers
 */
public class PostAccountCustomers extends PostOperation<Customer> {

	public static final String OPERATION_PATH = "/account/customers";


	{
		addRequiredField("email");
		addRequiredField("password");
		addRequiredField("passwordConfirmation");
	}


	public PostAccountCustomers() {
		super(OPERATION_PATH);
	}
	

	public Class<Customer> getResourceType() {
		return Customer.class;
	}
	
}
