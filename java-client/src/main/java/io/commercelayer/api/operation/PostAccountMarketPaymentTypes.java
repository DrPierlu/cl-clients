package io.commercelayer.api.operation;

import io.commercelayer.api.model.MarketPaymentType;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountMarketPaymentTypes
 */
public class PostAccountMarketPaymentTypes extends PostOperation<MarketPaymentType> {

	public static final String OPERATION_PATH = "/account/market_payment_types";


	{
		addRequiredField("marketId");
		addRequiredField("paymentTypeId");
		addRequiredField("countryCodeRegex");
		addRequiredField("notCountryCodeRegex");
	}


	public PostAccountMarketPaymentTypes() {
		super(OPERATION_PATH);
	}
	

	public Class<MarketPaymentType> getResourceType() {
		return MarketPaymentType.class;
	}
	
}
