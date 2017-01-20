package io.commercelayer.api.operation;

import io.commercelayer.api.model.User;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountUsersId
 */
public class PutAccountUsersId extends PutOperation {

	public static final String OPERATION_PATH = "/account/users/{id}";


	{
		addRequiredField("firstName");
		addRequiredField("lastName");
		addRequiredField("email");
		addRequiredField("password");
		addRequiredField("passwordConfirmation");
		addRequiredField("id");
	}


	public PutAccountUsersId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountUsersId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return User.class;
	}
	
}
