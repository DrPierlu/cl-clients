package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountCustomers
 */
public class PostAccountCustomers extends PostOperation {

	public static final String OPERATION_PATH = "/account/customers";


	{
		addRequiredField("email");
	}

	public PostAccountCustomers() {
		super(OPERATION_PATH);
	}
	
}
