package io.commercelayer.api.operation;

import io.commercelayer.api.model.Permission;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountPermissionsId
 */
public class GetAccountPermissionsId extends GetIdOperation<Permission> {

	public static final String OPERATION_PATH = "/account/permissions/{id}";


	public GetAccountPermissionsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountPermissionsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Permission> getResourceType() {
		return Permission.class;
	}
	
}
