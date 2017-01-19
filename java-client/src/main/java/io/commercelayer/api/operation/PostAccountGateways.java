package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountGateways
 */
public class PostAccountGateways extends PostOperation {

	public static final String OPERATION_PATH = "/account/gateways";


	{
		addRequiredField("kind");
	}


	public PostAccountGateways() {
		super(OPERATION_PATH);
	}
	
}
