package io.commercelayer.api.operation;

import io.commercelayer.api.model.ConsumerRole;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountConsumerRolesIdMoveBottom
 */
public class PutAccountConsumerRolesIdMoveBottom extends MoveOperation<ConsumerRole> {

	public static final String OPERATION_PATH = "/account/consumer_roles/{id}/move_bottom";


	public PutAccountConsumerRolesIdMoveBottom() {
		super(OPERATION_PATH);
	}
	

	public PutAccountConsumerRolesIdMoveBottom(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ConsumerRole> getResourceType() {
		return ConsumerRole.class;
	}
	
}
