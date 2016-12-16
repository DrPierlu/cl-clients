package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;

/**
 * GetAccountOrdersId
 */
public class GetAccountOrdersId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/orders/{id}";


	public GetAccountOrdersId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountOrdersId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
