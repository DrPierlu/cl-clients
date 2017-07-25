package io.commercelayer.api.operation;

import io.commercelayer.api.model.Country;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetChannelCountries
 */
public class GetChannelCountries extends SearchOperation<Country> {

	public static final String OPERATION_PATH = "/channel/countries";


	public GetChannelCountries() {
		super(OPERATION_PATH);
	}
	

	public Class<Country> getResourceType() {
		return Country.class;
	}
	
}
