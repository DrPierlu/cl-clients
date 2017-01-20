package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingServiceStockLocation;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountShippingServiceStockLocations
 */
public class GetAccountShippingServiceStockLocations extends SearchOperation<ShippingServiceStockLocation> {

	public static final String OPERATION_PATH = "/account/shipping_service_stock_locations";


	public GetAccountShippingServiceStockLocations() {
		super(OPERATION_PATH);
	}
	

	public Class<ShippingServiceStockLocation> getResourceType() {
		return ShippingServiceStockLocation.class;
	}
	
}
