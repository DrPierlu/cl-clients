package io.commercelayer.api.operation;

import io.commercelayer.api.model.Role;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountRoles
 */
public class GetAccountRoles extends SearchOperation<Role> {

	public static final String OPERATION_PATH = "/account/roles";


	public GetAccountRoles() {
		super(OPERATION_PATH);
	}
	

	public Class<Role> getResourceType() {
		return Role.class;
	}
	
}
