package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAccountPriceLists
 */
public class GetAccountPriceLists extends SearchOperation {

	public static final String OPERATION_PATH = "/account/price_lists";


	public GetAccountPriceLists() {
		super(OPERATION_PATH);
	}
	
}
