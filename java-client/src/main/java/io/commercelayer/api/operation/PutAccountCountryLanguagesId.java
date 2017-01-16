package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountCountryLanguagesId
 */
public class PutAccountCountryLanguagesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/country_languages/{id}";


	{
		addRequiredField("countryId");
		addRequiredField("languageId");
		addRequiredField("id");
	}


	public PutAccountCountryLanguagesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountCountryLanguagesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
