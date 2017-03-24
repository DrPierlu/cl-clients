package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountShipmentsIdPurchase
 */
public class PutAccountShipmentsIdPurchase extends PutOperation {

	public static final String OPERATION_PATH = "/account/shipments/{id}/purchase";


	{
		
	}


	public PutAccountShipmentsIdPurchase() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShipmentsIdPurchase(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
