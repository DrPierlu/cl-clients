package io.commercelayer.api.operation;

import io.commercelayer.api.model.MarketPriceList;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountMarketPriceListsId
 */
public class DeleteAccountMarketPriceListsId extends DeleteOperation<MarketPriceList> {

	public static final String OPERATION_PATH = "/account/market_price_lists/{id}";


	public DeleteAccountMarketPriceListsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountMarketPriceListsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<MarketPriceList> getResourceType() {
		return MarketPriceList.class;
	}
	
}
