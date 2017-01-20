package io.commercelayer.api.operation;

import io.commercelayer.api.model.ConsumerRole;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountConsumerRoles
 */
public class GetAccountConsumerRoles extends SearchOperation {

	public static final String OPERATION_PATH = "/account/consumer_roles";


	public GetAccountConsumerRoles() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ConsumerRole.class;
	}
	
}
