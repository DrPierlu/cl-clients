package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountConsumerRolesId
 */
public class GetAccountConsumerRolesId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/consumer_roles/{id}";


	public GetAccountConsumerRolesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountConsumerRolesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
