package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountShipmentsIdShip
 */
public class PutAccountShipmentsIdShip extends PutOperation {

	public static final String OPERATION_PATH = "/account/shipments/{id}/ship";


	{
		
	}


	public PutAccountShipmentsIdShip() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShipmentsIdShip(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
