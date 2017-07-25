package io.commercelayer.api.operation;

import io.commercelayer.api.model.Customer;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostChannelCustomers
 */
public class PostChannelCustomers extends PostOperation<Customer> {

	public static final String OPERATION_PATH = "/channel/customers";


	{
		addRequiredField("email");
		addRequiredField("password");
		addRequiredField("passwordConfirmation");
		addRequiredField("resourceImageIds");
		addRequiredField("imageIds");
		addRequiredField("orderIds");
	}


	public PostChannelCustomers() {
		super(OPERATION_PATH);
	}
	

	public Class<Customer> getResourceType() {
		return Customer.class;
	}
	
}
