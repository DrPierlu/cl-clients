package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountMarketPaymentTypesId
 */
public class PutAccountMarketPaymentTypesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/market_payment_types/{id}";


	public PutAccountMarketPaymentTypesId() {
		super(OPERATION_PATH);
	}
	
}
