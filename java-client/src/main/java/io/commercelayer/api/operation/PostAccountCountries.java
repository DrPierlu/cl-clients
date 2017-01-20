package io.commercelayer.api.operation;

import io.commercelayer.api.model.Country;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountCountries
 */
public class PostAccountCountries extends PostOperation {

	public static final String OPERATION_PATH = "/account/countries";


	{
		addRequiredField("countryGroupId");
		addRequiredField("code");
	}


	public PostAccountCountries() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Country.class;
	}
	
}
