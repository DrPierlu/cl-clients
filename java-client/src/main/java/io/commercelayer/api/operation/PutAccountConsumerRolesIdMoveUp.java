package io.commercelayer.api.operation;

import io.commercelayer.api.model.ConsumerRole;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountConsumerRolesIdMoveUp
 */
public class PutAccountConsumerRolesIdMoveUp extends MoveOperation {

	public static final String OPERATION_PATH = "/account/consumer_roles/{id}/move_up";


	public PutAccountConsumerRolesIdMoveUp() {
		super(OPERATION_PATH);
	}
	

	public PutAccountConsumerRolesIdMoveUp(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ConsumerRole.class;
	}
	
}
