package io.commercelayer.api.operation;

import io.commercelayer.api.model.Customer;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostChannelCustomers
 */
public class PostChannelCustomers extends PostOperation {

	public static final String OPERATION_PATH = "/channel/customers";


	{
		addRequiredField("email");
	}


	public PostChannelCustomers() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Customer.class;
	}
	
}
