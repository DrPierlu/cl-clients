package io.commercelayer.api.operation;

import io.commercelayer.api.model.Gateway;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountGatewaysId
 */
public class GetAccountGatewaysId extends GetIdOperation<Gateway> {

	public static final String OPERATION_PATH = "/account/gateways/{id}";


	public GetAccountGatewaysId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountGatewaysId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Gateway> getResourceType() {
		return Gateway.class;
	}
	
}
