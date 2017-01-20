package io.commercelayer.api.operation;

import io.commercelayer.api.model.Organization;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountOrganizations
 */
public class GetAccountOrganizations extends SearchOperation<Organization> {

	public static final String OPERATION_PATH = "/account/organizations";


	public GetAccountOrganizations() {
		super(OPERATION_PATH);
	}
	

	public Class<Organization> getResourceType() {
		return Organization.class;
	}
	
}
