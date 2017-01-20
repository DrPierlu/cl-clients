package io.commercelayer.api.operation;

import io.commercelayer.api.model.MarketShippingService;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountMarketShippingServices
 */
public class PostAccountMarketShippingServices extends PostOperation<MarketShippingService> {

	public static final String OPERATION_PATH = "/account/market_shipping_services";


	{
		addRequiredField("marketId");
		addRequiredField("shippingServiceId");
		addRequiredField("price");
		addRequiredField("freeOverAmount");
	}


	public PostAccountMarketShippingServices() {
		super(OPERATION_PATH);
	}
	

	public Class<MarketShippingService> getResourceType() {
		return MarketShippingService.class;
	}
	
}
