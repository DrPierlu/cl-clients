package io.commercelayer.api.operation;

import io.commercelayer.api.model.MarketPaymentType;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountMarketPaymentTypes
 */
public class GetAccountMarketPaymentTypes extends SearchOperation<MarketPaymentType> {

	public static final String OPERATION_PATH = "/account/market_payment_types";


	public GetAccountMarketPaymentTypes() {
		super(OPERATION_PATH);
	}
	

	public Class<MarketPaymentType> getResourceType() {
		return MarketPaymentType.class;
	}
	
}
