package io.commercelayer.api.operation;

import io.commercelayer.api.model.Currency;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAllCurrencies
 */
public class GetAllCurrencies extends SearchOperation {

	public static final String OPERATION_PATH = "/all/currencies";


	public GetAllCurrencies() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Currency.class;
	}
	
}
