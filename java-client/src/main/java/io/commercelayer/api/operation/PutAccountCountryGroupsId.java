package io.commercelayer.api.operation;

import io.commercelayer.api.model.CountryGroup;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountCountryGroupsId
 */
public class PutAccountCountryGroupsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/country_groups/{id}";


	{
		addRequiredField("name");
		addRequiredField("id");
	}


	public PutAccountCountryGroupsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountCountryGroupsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return CountryGroup.class;
	}
	
}
