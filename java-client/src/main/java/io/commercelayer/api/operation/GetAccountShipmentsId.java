package io.commercelayer.api.operation;

import io.commercelayer.api.model.Shipment;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountShipmentsId
 */
public class GetAccountShipmentsId extends GetIdOperation<Shipment> {

	public static final String OPERATION_PATH = "/account/shipments/{id}";


	public GetAccountShipmentsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountShipmentsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Shipment> getResourceType() {
		return Shipment.class;
	}
	
}
