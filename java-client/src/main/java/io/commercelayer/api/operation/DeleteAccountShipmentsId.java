package io.commercelayer.api.operation;

import io.commercelayer.api.model.Shipment;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountShipmentsId
 */
public class DeleteAccountShipmentsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/shipments/{id}";


	public DeleteAccountShipmentsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountShipmentsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Shipment.class;
	}
	
}
