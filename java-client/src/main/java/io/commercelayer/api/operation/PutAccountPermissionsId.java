package io.commercelayer.api.operation;

import io.commercelayer.api.model.Permission;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountPermissionsId
 */
public class PutAccountPermissionsId extends PutOperation<Permission> {

	public static final String OPERATION_PATH = "/account/permissions/{id}";


	{
		addRequiredField("roleId");
		addRequiredField("ability");
		addRequiredField("action");
		addRequiredField("resource");
		addRequiredField("restrictions");
		addRequiredField("id");
	}


	public PutAccountPermissionsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountPermissionsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Permission> getResourceType() {
		return Permission.class;
	}
	
}
