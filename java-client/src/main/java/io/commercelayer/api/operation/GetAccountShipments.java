package io.commercelayer.api.operation;

import io.commercelayer.api.model.Shipment;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountShipments
 */
public class GetAccountShipments extends SearchOperation<Shipment> {

	public static final String OPERATION_PATH = "/account/shipments";


	public GetAccountShipments() {
		super(OPERATION_PATH);
	}
	

	public Class<Shipment> getResourceType() {
		return Shipment.class;
	}
	
}
