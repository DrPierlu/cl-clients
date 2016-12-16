package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAccountPricesIdExchanges
 */
public class GetAccountPricesIdExchanges extends SearchOperation {

	public static final String OPERATION_PATH = "/account/prices/{id}/exchanges";


	public GetAccountPricesIdExchanges() {
		super(OPERATION_PATH);
	}
	
}
