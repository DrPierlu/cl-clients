package io.commercelayer.api.operation;

import io.commercelayer.api.model.Gateway;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAllGateways
 */
public class GetAllGateways extends SearchOperation {

	public static final String OPERATION_PATH = "/all/gateways";


	public GetAllGateways() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Gateway.class;
	}
	
}
