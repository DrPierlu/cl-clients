package io.commercelayer.api.operation;

import io.commercelayer.api.model.Market;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountMarkets
 */
public class GetAccountMarkets extends SearchOperation<Market> {

	public static final String OPERATION_PATH = "/account/markets";


	public GetAccountMarkets() {
		super(OPERATION_PATH);
	}
	

	public Class<Market> getResourceType() {
		return Market.class;
	}
	
}
