package io.commercelayer.api.operation;

import io.commercelayer.api.model.Country;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountCountries
 */
public class GetAccountCountries extends SearchOperation {

	public static final String OPERATION_PATH = "/account/countries";


	public GetAccountCountries() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Country.class;
	}
	
}
