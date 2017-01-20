package io.commercelayer.api.operation;

import io.commercelayer.api.model.CountryGroup;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountCountryGroups
 */
public class PostAccountCountryGroups extends PostOperation<CountryGroup> {

	public static final String OPERATION_PATH = "/account/country_groups";


	{
		addRequiredField("name");
	}


	public PostAccountCountryGroups() {
		super(OPERATION_PATH);
	}
	

	public Class<CountryGroup> getResourceType() {
		return CountryGroup.class;
	}
	
}
