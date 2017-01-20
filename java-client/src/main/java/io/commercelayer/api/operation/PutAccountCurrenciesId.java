package io.commercelayer.api.operation;

import io.commercelayer.api.model.Currency;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountCurrenciesId
 */
public class PutAccountCurrenciesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/currencies/{id}";


	{
		addRequiredField("code");
		addRequiredField("id");
	}


	public PutAccountCurrenciesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountCurrenciesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Currency.class;
	}
	
}
