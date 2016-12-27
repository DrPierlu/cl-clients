package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountOrganizations
 */
public class PostAccountOrganizations extends PostOperation {

	public static final String OPERATION_PATH = "/account/organizations";


	{
		addRequiredField("name");
	}


	public PostAccountOrganizations() {
		super(OPERATION_PATH);
	}
	
}
