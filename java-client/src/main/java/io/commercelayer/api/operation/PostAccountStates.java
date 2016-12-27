package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountStates
 */
public class PostAccountStates extends PostOperation {

	public static final String OPERATION_PATH = "/account/states";


	{
		addRequiredField("countryId");
		addRequiredField("code");
	}


	public PostAccountStates() {
		super(OPERATION_PATH);
	}
	
}
