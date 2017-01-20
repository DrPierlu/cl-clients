package io.commercelayer.api.operation;

import io.commercelayer.api.model.Price;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountPrices
 */
public class GetAccountPrices extends SearchOperation<Price> {

	public static final String OPERATION_PATH = "/account/prices";


	public GetAccountPrices() {
		super(OPERATION_PATH);
	}
	

	public Class<Price> getResourceType() {
		return Price.class;
	}
	
}
