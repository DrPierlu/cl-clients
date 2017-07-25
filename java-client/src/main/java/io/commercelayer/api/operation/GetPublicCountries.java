package io.commercelayer.api.operation;

import io.commercelayer.api.model.Country;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetPublicCountries
 */
public class GetPublicCountries extends SearchOperation<Country> {

	public static final String OPERATION_PATH = "/public/countries";


	public GetPublicCountries() {
		super(OPERATION_PATH);
	}
	

	public Class<Country> getResourceType() {
		return Country.class;
	}
	
}
