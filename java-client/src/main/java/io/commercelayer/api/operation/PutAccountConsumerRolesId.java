package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountConsumerRolesId
 */
public class PutAccountConsumerRolesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/consumer_roles/{id}";


	public PutAccountConsumerRolesId() {
		super(OPERATION_PATH);
	}
	
}
