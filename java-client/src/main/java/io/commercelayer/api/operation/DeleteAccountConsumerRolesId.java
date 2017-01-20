package io.commercelayer.api.operation;

import io.commercelayer.api.model.ConsumerRole;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountConsumerRolesId
 */
public class DeleteAccountConsumerRolesId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/consumer_roles/{id}";


	public DeleteAccountConsumerRolesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountConsumerRolesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ConsumerRole.class;
	}
	
}
