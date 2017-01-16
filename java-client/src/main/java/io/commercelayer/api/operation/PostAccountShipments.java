package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountShipments
 */
public class PostAccountShipments extends PostOperation {

	public static final String OPERATION_PATH = "/account/shipments";


	public PostAccountShipments() {
		super(OPERATION_PATH);
	}
	
}
