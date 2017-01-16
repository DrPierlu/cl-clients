package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountMarketPaymentTypes
 */
public class GetAccountMarketPaymentTypes extends SearchOperation {

	public static final String OPERATION_PATH = "/account/market_payment_types";


	public GetAccountMarketPaymentTypes() {
		super(OPERATION_PATH);
	}
	
}
