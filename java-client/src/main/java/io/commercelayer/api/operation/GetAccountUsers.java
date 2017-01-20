package io.commercelayer.api.operation;

import io.commercelayer.api.model.User;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountUsers
 */
public class GetAccountUsers extends SearchOperation<User> {

	public static final String OPERATION_PATH = "/account/users";


	public GetAccountUsers() {
		super(OPERATION_PATH);
	}
	

	public Class<User> getResourceType() {
		return User.class;
	}
	
}
