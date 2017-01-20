package io.commercelayer.api.operation;

import io.commercelayer.api.model.MarketPaymentType;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountMarketPaymentTypesId
 */
public class PutAccountMarketPaymentTypesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/market_payment_types/{id}";


	{
		addRequiredField("marketId");
		addRequiredField("paymentTypeId");
		addRequiredField("price");
		addRequiredField("countryCodeRegex");
		addRequiredField("notCountryCodeRegex");
		addRequiredField("id");
	}


	public PutAccountMarketPaymentTypesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountMarketPaymentTypesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return MarketPaymentType.class;
	}
	
}
