package io.commercelayer.api.operation;

import io.commercelayer.api.model.CountryGroup;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountCountryGroupsId
 */
public class GetAccountCountryGroupsId extends GetIdOperation<CountryGroup> {

	public static final String OPERATION_PATH = "/account/country_groups/{id}";


	public GetAccountCountryGroupsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountCountryGroupsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<CountryGroup> getResourceType() {
		return CountryGroup.class;
	}
	
}
