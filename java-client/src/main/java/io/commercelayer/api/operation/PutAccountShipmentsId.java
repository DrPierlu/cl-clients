package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountShipmentsId
 */
public class PutAccountShipmentsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/shipments/{id}";


	public PutAccountShipmentsId() {
		super(OPERATION_PATH);
	}
	
}
