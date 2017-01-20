package io.commercelayer.api.operation;

import io.commercelayer.api.model.Price;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountPrices
 */
public class GetAccountPrices extends SearchOperation {

	public static final String OPERATION_PATH = "/account/prices";


	public GetAccountPrices() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Price.class;
	}
	
}
