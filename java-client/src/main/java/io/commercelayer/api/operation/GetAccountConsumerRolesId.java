package io.commercelayer.api.operation;

import io.commercelayer.api.model.ConsumerRole;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountConsumerRolesId
 */
public class GetAccountConsumerRolesId extends GetIdOperation<ConsumerRole> {

	public static final String OPERATION_PATH = "/account/consumer_roles/{id}";


	public GetAccountConsumerRolesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountConsumerRolesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ConsumerRole> getResourceType() {
		return ConsumerRole.class;
	}
	
}
