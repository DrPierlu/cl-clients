package io.commercelayer.api.operation;

import io.commercelayer.api.model.Gateway;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAllGateways
 */
public class GetAllGateways extends SearchOperation<Gateway> {

	public static final String OPERATION_PATH = "/all/gateways";


	public GetAllGateways() {
		super(OPERATION_PATH);
	}
	

	public Class<Gateway> getResourceType() {
		return Gateway.class;
	}
	
}
