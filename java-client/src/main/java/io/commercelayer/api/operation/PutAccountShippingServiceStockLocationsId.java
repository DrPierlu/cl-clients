package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingServiceStockLocation;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountShippingServiceStockLocationsId
 */
public class PutAccountShippingServiceStockLocationsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/shipping_service_stock_locations/{id}";


	{
		addRequiredField("shippingServiceId");
		addRequiredField("stockLocationId");
		addRequiredField("minLeadTimeHours");
		addRequiredField("maxLeadTimeHours");
		addRequiredField("id");
	}


	public PutAccountShippingServiceStockLocationsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShippingServiceStockLocationsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ShippingServiceStockLocation.class;
	}
	
}
