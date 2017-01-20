package io.commercelayer.api.operation;

import io.commercelayer.api.model.Currency;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAllCurrencies
 */
public class GetAllCurrencies extends SearchOperation<Currency> {

	public static final String OPERATION_PATH = "/all/currencies";


	public GetAllCurrencies() {
		super(OPERATION_PATH);
	}
	

	public Class<Currency> getResourceType() {
		return Currency.class;
	}
	
}
