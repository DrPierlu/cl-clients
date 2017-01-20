package io.commercelayer.api.operation;

import io.commercelayer.api.model.Market;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountMarkets
 */
public class GetAccountMarkets extends SearchOperation {

	public static final String OPERATION_PATH = "/account/markets";


	public GetAccountMarkets() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Market.class;
	}
	
}
