package io.commercelayer.api.operation;

import io.commercelayer.api.model.Currency;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountCurrencies
 */
public class GetAccountCurrencies extends SearchOperation<Currency> {

	public static final String OPERATION_PATH = "/account/currencies";


	public GetAccountCurrencies() {
		super(OPERATION_PATH);
	}
	

	public Class<Currency> getResourceType() {
		return Currency.class;
	}
	
}
