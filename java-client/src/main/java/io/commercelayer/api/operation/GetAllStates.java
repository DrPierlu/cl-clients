package io.commercelayer.api.operation;

import io.commercelayer.api.model.State;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAllStates
 */
public class GetAllStates extends SearchOperation {

	public static final String OPERATION_PATH = "/all/states";


	public GetAllStates() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return State.class;
	}
	
}
