package io.commercelayer.api.operation;

import io.commercelayer.api.model.Shipment;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountShipmentsId
 */
public class GetAccountShipmentsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/shipments/{id}";


	public GetAccountShipmentsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountShipmentsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Shipment.class;
	}
	
}
