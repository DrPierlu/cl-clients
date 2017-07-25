package io.commercelayer.api.operation;

import io.commercelayer.api.model.Gateway;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetPublicGateways
 */
public class GetPublicGateways extends SearchOperation<Gateway> {

	public static final String OPERATION_PATH = "/public/gateways";


	public GetPublicGateways() {
		super(OPERATION_PATH);
	}
	

	public Class<Gateway> getResourceType() {
		return Gateway.class;
	}
	
}
