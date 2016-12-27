package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountConsumerRolesId
 */
public class PutAccountConsumerRolesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/consumer_roles/{id}";


	{
		addRequiredField("consumerResource");
		addRequiredField("consumerId");
		addRequiredField("roleId");
		addRequiredField("id");
	}


	public PutAccountConsumerRolesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountConsumerRolesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
