package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingServiceStockLocation;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountShippingServiceStockLocationsId
 */
public class DeleteAccountShippingServiceStockLocationsId extends DeleteOperation<ShippingServiceStockLocation> {

	public static final String OPERATION_PATH = "/account/shipping_service_stock_locations/{id}";


	public DeleteAccountShippingServiceStockLocationsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountShippingServiceStockLocationsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingServiceStockLocation> getResourceType() {
		return ShippingServiceStockLocation.class;
	}
	
}
