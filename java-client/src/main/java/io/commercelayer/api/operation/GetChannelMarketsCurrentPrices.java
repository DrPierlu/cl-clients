package io.commercelayer.api.operation;

import io.commercelayer.api.model.Price;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetChannelMarketsCurrentPrices
 */
public class GetChannelMarketsCurrentPrices extends SearchOperation<Price> {

	public static final String OPERATION_PATH = "/channel/markets/current/prices";


	public GetChannelMarketsCurrentPrices() {
		super(OPERATION_PATH);
	}
	

	public Class<Price> getResourceType() {
		return Price.class;
	}
	
}
