package io.commercelayer.api.operation;

import io.commercelayer.api.model.Role;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountRolesId
 */
public class PutAccountRolesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/roles/{id}";


	{
		addRequiredField("name");
		addRequiredField("description");
		addRequiredField("id");
	}


	public PutAccountRolesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountRolesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Role.class;
	}
	
}
