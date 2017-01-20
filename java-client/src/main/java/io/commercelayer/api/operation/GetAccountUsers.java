package io.commercelayer.api.operation;

import io.commercelayer.api.model.User;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountUsers
 */
public class GetAccountUsers extends SearchOperation {

	public static final String OPERATION_PATH = "/account/users";


	public GetAccountUsers() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return User.class;
	}
	
}
