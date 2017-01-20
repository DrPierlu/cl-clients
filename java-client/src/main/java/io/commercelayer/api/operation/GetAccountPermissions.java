package io.commercelayer.api.operation;

import io.commercelayer.api.model.Permission;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountPermissions
 */
public class GetAccountPermissions extends SearchOperation<Permission> {

	public static final String OPERATION_PATH = "/account/permissions";


	public GetAccountPermissions() {
		super(OPERATION_PATH);
	}
	

	public Class<Permission> getResourceType() {
		return Permission.class;
	}
	
}
