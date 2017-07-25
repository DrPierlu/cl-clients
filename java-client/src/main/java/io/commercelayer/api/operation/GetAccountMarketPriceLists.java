package io.commercelayer.api.operation;

import io.commercelayer.api.model.MarketPriceList;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountMarketPriceLists
 */
public class GetAccountMarketPriceLists extends SearchOperation<MarketPriceList> {

	public static final String OPERATION_PATH = "/account/market_price_lists";


	public GetAccountMarketPriceLists() {
		super(OPERATION_PATH);
	}
	

	public Class<MarketPriceList> getResourceType() {
		return MarketPriceList.class;
	}
	
}
