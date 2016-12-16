package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAccountShipments
 */
public class GetAccountShipments extends SearchOperation {

	public static final String OPERATION_PATH = "/account/shipments";


	public GetAccountShipments() {
		super(OPERATION_PATH);
	}
	
}
