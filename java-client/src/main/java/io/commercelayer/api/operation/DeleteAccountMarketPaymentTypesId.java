package io.commercelayer.api.operation;

import io.commercelayer.api.model.MarketPaymentType;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountMarketPaymentTypesId
 */
public class DeleteAccountMarketPaymentTypesId extends DeleteOperation<MarketPaymentType> {

	public static final String OPERATION_PATH = "/account/market_payment_types/{id}";


	public DeleteAccountMarketPaymentTypesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountMarketPaymentTypesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<MarketPaymentType> getResourceType() {
		return MarketPaymentType.class;
	}
	
}
