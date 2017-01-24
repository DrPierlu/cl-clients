package io.commercelayer.api.operation;

import io.commercelayer.api.model.Currency;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountCurrenciesId
 */
public class PutAccountCurrenciesId extends PutOperation<Currency> {

	public static final String OPERATION_PATH = "/account/currencies/{id}";


	{
		addRequiredField("code");
	}


	public PutAccountCurrenciesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountCurrenciesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Currency> getResourceType() {
		return Currency.class;
	}
	
}
