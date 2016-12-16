package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAccountShippingServiceStockLocations
 */
public class GetAccountShippingServiceStockLocations extends SearchOperation {

	public static final String OPERATION_PATH = "/account/shipping_service_stock_locations";


	public GetAccountShippingServiceStockLocations() {
		super(OPERATION_PATH);
	}
	
}
