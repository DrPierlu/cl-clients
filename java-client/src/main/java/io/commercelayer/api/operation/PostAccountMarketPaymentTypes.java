package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountMarketPaymentTypes
 */
public class PostAccountMarketPaymentTypes extends PostOperation {

	public static final String OPERATION_PATH = "/account/market_payment_types";


	{
		addRequiredField("marketId");
		addRequiredField("paymentTypeId");
		addRequiredField("price");
		addRequiredField("countryCodeRegex");
		addRequiredField("notCountryCodeRegex");
	}


	public PostAccountMarketPaymentTypes() {
		super(OPERATION_PATH);
	}
	
}
