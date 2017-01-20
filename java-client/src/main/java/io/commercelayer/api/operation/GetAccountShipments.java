package io.commercelayer.api.operation;

import io.commercelayer.api.model.Shipment;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountShipments
 */
public class GetAccountShipments extends SearchOperation {

	public static final String OPERATION_PATH = "/account/shipments";


	public GetAccountShipments() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Shipment.class;
	}
	
}
