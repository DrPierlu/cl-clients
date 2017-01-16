package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountCountryLanguages
 */
public class GetAccountCountryLanguages extends SearchOperation {

	public static final String OPERATION_PATH = "/account/country_languages";


	public GetAccountCountryLanguages() {
		super(OPERATION_PATH);
	}
	
}
