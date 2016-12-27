package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountConsumerRoles
 */
public class PostAccountConsumerRoles extends PostOperation {

	public static final String OPERATION_PATH = "/account/consumer_roles";


	{
		addRequiredField("consumerResource");
		addRequiredField("consumerId");
		addRequiredField("roleId");
	}


	public PostAccountConsumerRoles() {
		super(OPERATION_PATH);
	}
	
}
