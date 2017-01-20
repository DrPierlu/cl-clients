package io.commercelayer.api.operation;

import io.commercelayer.api.model.CountryLanguage;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountCountryLanguages
 */
public class PostAccountCountryLanguages extends PostOperation<CountryLanguage> {

	public static final String OPERATION_PATH = "/account/country_languages";


	{
		addRequiredField("countryId");
		addRequiredField("languageId");
	}


	public PostAccountCountryLanguages() {
		super(OPERATION_PATH);
	}
	

	public Class<CountryLanguage> getResourceType() {
		return CountryLanguage.class;
	}
	
}
