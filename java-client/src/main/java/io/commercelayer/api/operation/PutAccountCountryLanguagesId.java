package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountCountryLanguagesId
 */
public class PutAccountCountryLanguagesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/country_languages/{id}";


	public PutAccountCountryLanguagesId() {
		super(OPERATION_PATH);
	}
	
}
