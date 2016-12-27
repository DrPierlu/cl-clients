package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountCustomersId
 */
public class PutAccountCustomersId extends PutOperation {

	public static final String OPERATION_PATH = "/account/customers/{id}";


	{
		addRequiredField("email");
		addRequiredField("id");
	}


	public PutAccountCustomersId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountCustomersId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
