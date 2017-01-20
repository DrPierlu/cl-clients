package io.commercelayer.api.operation;

import io.commercelayer.api.model.Permission;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountPermissions
 */
public class GetAccountPermissions extends SearchOperation {

	public static final String OPERATION_PATH = "/account/permissions";


	public GetAccountPermissions() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Permission.class;
	}
	
}
