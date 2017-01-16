package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountShippingServiceStockLocations
 */
public class PostAccountShippingServiceStockLocations extends PostOperation {

	public static final String OPERATION_PATH = "/account/shipping_service_stock_locations";


	{
		addRequiredField("shippingServiceId");
		addRequiredField("stockLocationId");
		addRequiredField("minLeadTimeHours");
		addRequiredField("maxLeadTimeHours");
	}


	public PostAccountShippingServiceStockLocations() {
		super(OPERATION_PATH);
	}
	
}
