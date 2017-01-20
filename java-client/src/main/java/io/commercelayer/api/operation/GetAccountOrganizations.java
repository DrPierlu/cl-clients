package io.commercelayer.api.operation;

import io.commercelayer.api.model.Organization;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountOrganizations
 */
public class GetAccountOrganizations extends SearchOperation {

	public static final String OPERATION_PATH = "/account/organizations";


	public GetAccountOrganizations() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Organization.class;
	}
	
}
