package io.commercelayer.api.operation;

import io.commercelayer.api.model.State;
import io.commercelayer.api.model.common.ApiResource;
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
	

	public Class<? extends ApiResource> getResourceType() {
		return State.class;
	}
	
}
