package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountCountryLanguagesId
 */
public class GetAccountCountryLanguagesId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/country_languages/{id}";


	public GetAccountCountryLanguagesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountCountryLanguagesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
