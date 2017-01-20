package io.commercelayer.api.operation;

import io.commercelayer.api.model.User;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountUsers
 */
public class PostAccountUsers extends PostOperation {

	public static final String OPERATION_PATH = "/account/users";


	{
		addRequiredField("firstName");
		addRequiredField("lastName");
		addRequiredField("email");
		addRequiredField("password");
		addRequiredField("passwordConfirmation");
	}


	public PostAccountUsers() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return User.class;
	}
	
}
