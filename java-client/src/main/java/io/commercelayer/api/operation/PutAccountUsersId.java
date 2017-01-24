package io.commercelayer.api.operation;

import io.commercelayer.api.model.User;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountUsersId
 */
public class PutAccountUsersId extends PutOperation<User> {

	public static final String OPERATION_PATH = "/account/users/{id}";


	{
		addRequiredField("firstName");
		addRequiredField("lastName");
		addRequiredField("email");
		addRequiredField("password");
		addRequiredField("passwordConfirmation");
	}


	public PutAccountUsersId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountUsersId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<User> getResourceType() {
		return User.class;
	}
	
}
