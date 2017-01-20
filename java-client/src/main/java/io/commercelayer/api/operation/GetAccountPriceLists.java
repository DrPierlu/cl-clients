package io.commercelayer.api.operation;

import io.commercelayer.api.model.PriceList;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountPriceLists
 */
public class GetAccountPriceLists extends SearchOperation {

	public static final String OPERATION_PATH = "/account/price_lists";


	public GetAccountPriceLists() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return PriceList.class;
	}
	
}
