package io.commercelayer.api.operation;

import io.commercelayer.api.model.User;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountUsersId
 */
public class DeleteAccountUsersId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/users/{id}";


	public DeleteAccountUsersId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountUsersId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return User.class;
	}
	
}
