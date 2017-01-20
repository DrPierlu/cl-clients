package io.commercelayer.api.operation;

import io.commercelayer.api.model.Gateway;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountGateways
 */
public class GetAccountGateways extends SearchOperation<Gateway> {

	public static final String OPERATION_PATH = "/account/gateways";


	public GetAccountGateways() {
		super(OPERATION_PATH);
	}
	

	public Class<Gateway> getResourceType() {
		return Gateway.class;
	}
	
}
