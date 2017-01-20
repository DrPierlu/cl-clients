package io.commercelayer.api.operation;

import io.commercelayer.api.model.Gateway;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountGatewaysId
 */
public class DeleteAccountGatewaysId extends DeleteOperation<Gateway> {

	public static final String OPERATION_PATH = "/account/gateways/{id}";


	public DeleteAccountGatewaysId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountGatewaysId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Gateway> getResourceType() {
		return Gateway.class;
	}
	
}
