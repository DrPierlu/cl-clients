package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountShipmentsIdCancel
 */
public class PutAccountShipmentsIdCancel extends PutOperation {

	public static final String OPERATION_PATH = "/account/shipments/{id}/cancel";


	{
		
	}


	public PutAccountShipmentsIdCancel() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShipmentsIdCancel(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
