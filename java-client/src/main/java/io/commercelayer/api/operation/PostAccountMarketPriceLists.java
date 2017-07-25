package io.commercelayer.api.operation;

import io.commercelayer.api.model.MarketPriceList;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountMarketPriceLists
 */
public class PostAccountMarketPriceLists extends PostOperation<MarketPriceList> {

	public static final String OPERATION_PATH = "/account/market_price_lists";


	{
		addRequiredField("marketId");
		addRequiredField("priceListId");
	}


	public PostAccountMarketPriceLists() {
		super(OPERATION_PATH);
	}
	

	public Class<MarketPriceList> getResourceType() {
		return MarketPriceList.class;
	}
	
}
