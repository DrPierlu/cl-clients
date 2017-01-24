package io.commercelayer.api.operation;

import io.commercelayer.api.model.Shipment;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountShipmentsId
 */
public class PutAccountShipmentsId extends PutOperation<Shipment> {

	public static final String OPERATION_PATH = "/account/shipments/{id}";


	{
		
	}


	public PutAccountShipmentsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShipmentsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Shipment> getResourceType() {
		return Shipment.class;
	}
	
}
