package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetChannelCountryLanguages
 */
public class GetChannelCountryLanguages extends SearchOperation {

	public static final String OPERATION_PATH = "/channel/country_languages";


	public GetChannelCountryLanguages() {
		super(OPERATION_PATH);
	}
	
}
