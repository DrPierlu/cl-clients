package io.commercelayer.api.operation;

import io.commercelayer.api.model.Permission;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountPermissions
 */
public class PostAccountPermissions extends PostOperation<Permission> {

	public static final String OPERATION_PATH = "/account/permissions";


	{
		addRequiredField("roleId");
		addRequiredField("ability");
		addRequiredField("action");
		addRequiredField("resource");
		addRequiredField("restrictions");
	}


	public PostAccountPermissions() {
		super(OPERATION_PATH);
	}
	

	public Class<Permission> getResourceType() {
		return Permission.class;
	}
	
}
