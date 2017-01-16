package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountMarkets
 */
public class GetAccountMarkets extends SearchOperation {

	public static final String OPERATION_PATH = "/account/markets";


	public GetAccountMarkets() {
		super(OPERATION_PATH);
	}
	
}
