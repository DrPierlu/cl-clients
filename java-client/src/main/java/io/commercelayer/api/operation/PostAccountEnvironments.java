package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountEnvironments
 */
public class PostAccountEnvironments extends PostOperation {

	public static final String OPERATION_PATH = "/account/environments";


	{
		addRequiredField("name");
		addRequiredField("organizationId");
	}

	public PostAccountEnvironments() {
		super(OPERATION_PATH);
	}
	
}
