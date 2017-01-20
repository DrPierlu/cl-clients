package io.commercelayer.api.operation;

import io.commercelayer.api.model.CountryLanguage;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountCountryLanguagesId
 */
public class PutAccountCountryLanguagesId extends PutOperation<CountryLanguage> {

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
	

	public Class<CountryLanguage> getResourceType() {
		return CountryLanguage.class;
	}
	
}
