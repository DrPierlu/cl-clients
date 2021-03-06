package io.commercelayer.api.operation;

import io.commercelayer.api.model.ConsumerRole;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountConsumerRoles
 */
public class PostAccountConsumerRoles extends PostOperation<ConsumerRole> {

	public static final String OPERATION_PATH = "/account/consumer_roles";


	{
		addRequiredField("consumerResource");
		addRequiredField("consumerId");
		addRequiredField("roleId");
	}


	public PostAccountConsumerRoles() {
		super(OPERATION_PATH);
	}
	

	public Class<ConsumerRole> getResourceType() {
		return ConsumerRole.class;
	}
	
}
