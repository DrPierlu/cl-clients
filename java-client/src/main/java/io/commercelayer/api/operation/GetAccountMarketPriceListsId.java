package io.commercelayer.api.operation;

import io.commercelayer.api.model.MarketPriceList;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountMarketPriceListsId
 */
public class GetAccountMarketPriceListsId extends GetIdOperation<MarketPriceList> {

	public static final String OPERATION_PATH = "/account/market_price_lists/{id}";


	public GetAccountMarketPriceListsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountMarketPriceListsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<MarketPriceList> getResourceType() {
		return MarketPriceList.class;
	}
	
}
