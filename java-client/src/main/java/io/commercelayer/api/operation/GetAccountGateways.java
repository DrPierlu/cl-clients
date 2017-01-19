package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountGateways
 */
public class GetAccountGateways extends SearchOperation {

	public static final String OPERATION_PATH = "/account/gateways";


	public GetAccountGateways() {
		super(OPERATION_PATH);
	}
	
}
