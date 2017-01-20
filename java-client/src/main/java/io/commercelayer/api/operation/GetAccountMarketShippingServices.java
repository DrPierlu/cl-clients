package io.commercelayer.api.operation;

import io.commercelayer.api.model.MarketShippingService;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountMarketShippingServices
 */
public class GetAccountMarketShippingServices extends SearchOperation {

	public static final String OPERATION_PATH = "/account/market_shipping_services";


	public GetAccountMarketShippingServices() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return MarketShippingService.class;
	}
	
}
