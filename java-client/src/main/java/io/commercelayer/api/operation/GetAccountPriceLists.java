package io.commercelayer.api.operation;

import io.commercelayer.api.model.PriceList;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountPriceLists
 */
public class GetAccountPriceLists extends SearchOperation<PriceList> {

	public static final String OPERATION_PATH = "/account/price_lists";


	public GetAccountPriceLists() {
		super(OPERATION_PATH);
	}
	

	public Class<PriceList> getResourceType() {
		return PriceList.class;
	}
	
}
