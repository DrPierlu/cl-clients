package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountMarketPaymentTypes
 */
public class PostAccountMarketPaymentTypes extends PostOperation {

	public static final String OPERATION_PATH = "/account/market_payment_types";


	public PostAccountMarketPaymentTypes() {
		super(OPERATION_PATH);
	}
	
}
