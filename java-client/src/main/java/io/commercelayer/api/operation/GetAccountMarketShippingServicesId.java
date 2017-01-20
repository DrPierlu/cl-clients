package io.commercelayer.api.operation;

import io.commercelayer.api.model.MarketShippingService;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountMarketShippingServicesId
 */
public class GetAccountMarketShippingServicesId extends GetIdOperation<MarketShippingService> {

	public static final String OPERATION_PATH = "/account/market_shipping_services/{id}";


	public GetAccountMarketShippingServicesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountMarketShippingServicesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<MarketShippingService> getResourceType() {
		return MarketShippingService.class;
	}
	
}
