package io.commercelayer.api.operation;

import io.commercelayer.api.model.Currency;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountCurrencies
 */
public class PostAccountCurrencies extends PostOperation<Currency> {

	public static final String OPERATION_PATH = "/account/currencies";


	{
		addRequiredField("code");
	}


	public PostAccountCurrencies() {
		super(OPERATION_PATH);
	}
	

	public Class<Currency> getResourceType() {
		return Currency.class;
	}
	
}
