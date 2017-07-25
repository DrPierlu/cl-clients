package io.commercelayer.api.operation;

import io.commercelayer.api.model.MarketPriceList;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountMarketPriceListsId
 */
public class PutAccountMarketPriceListsId extends PutOperation<MarketPriceList> {

	public static final String OPERATION_PATH = "/account/market_price_lists/{id}";


	{
		addRequiredField("marketId");
		addRequiredField("priceListId");
	}


	public PutAccountMarketPriceListsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountMarketPriceListsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<MarketPriceList> getResourceType() {
		return MarketPriceList.class;
	}
	
}
