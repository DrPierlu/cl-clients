package io.commercelayer.api.operation;

import io.commercelayer.api.model.CountryGroup;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountCountryGroupsId
 */
public class DeleteAccountCountryGroupsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/country_groups/{id}";


	public DeleteAccountCountryGroupsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountCountryGroupsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return CountryGroup.class;
	}
	
}
