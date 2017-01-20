package io.commercelayer.api.operation;

import io.commercelayer.api.model.Country;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAllCountries
 */
public class GetAllCountries extends SearchOperation {

	public static final String OPERATION_PATH = "/all/countries";


	public GetAllCountries() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Country.class;
	}
	
}
