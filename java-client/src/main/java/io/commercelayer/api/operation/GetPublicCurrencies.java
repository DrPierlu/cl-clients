package io.commercelayer.api.operation;

import io.commercelayer.api.model.Currency;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetPublicCurrencies
 */
public class GetPublicCurrencies extends SearchOperation<Currency> {

	public static final String OPERATION_PATH = "/public/currencies";


	public GetPublicCurrencies() {
		super(OPERATION_PATH);
	}
	

	public Class<Currency> getResourceType() {
		return Currency.class;
	}
	
}
