package io.commercelayer.api.operation;

import io.commercelayer.api.model.Role;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountRolesId
 */
public class PutAccountRolesId extends PutOperation<Role> {

	public static final String OPERATION_PATH = "/account/roles/{id}";


	{
		addRequiredField("name");
		addRequiredField("description");
		addRequiredField("consumerRoleIds");
		addRequiredField("permissionIds");
		addRequiredField("consumerIds");
	}


	public PutAccountRolesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountRolesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Role> getResourceType() {
		return Role.class;
	}
	
}
