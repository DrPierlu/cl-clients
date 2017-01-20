package io.commercelayer.api.operation;

import io.commercelayer.api.model.Organization;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountOrganizationsId
 */
public class GetAccountOrganizationsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/organizations/{id}";


	public GetAccountOrganizationsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountOrganizationsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Organization.class;
	}
	
}
