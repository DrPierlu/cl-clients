package io.commercelayer.api.operation;

import io.commercelayer.api.model.Role;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountRoles
 */
public class GetAccountRoles extends SearchOperation {

	public static final String OPERATION_PATH = "/account/roles";


	public GetAccountRoles() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Role.class;
	}
	
}
