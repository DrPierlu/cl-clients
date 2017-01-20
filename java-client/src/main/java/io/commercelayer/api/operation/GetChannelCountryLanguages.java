package io.commercelayer.api.operation;

import io.commercelayer.api.model.CountryLanguage;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetChannelCountryLanguages
 */
public class GetChannelCountryLanguages extends SearchOperation<CountryLanguage> {

	public static final String OPERATION_PATH = "/channel/country_languages";


	public GetChannelCountryLanguages() {
		super(OPERATION_PATH);
	}
	

	public Class<CountryLanguage> getResourceType() {
		return CountryLanguage.class;
	}
	
}
