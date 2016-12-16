package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAccountPrices
 */
public class GetAccountPrices extends SearchOperation {

	public static final String OPERATION_PATH = "/account/prices";


	public GetAccountPrices() {
		super(OPERATION_PATH);
	}
	
}
