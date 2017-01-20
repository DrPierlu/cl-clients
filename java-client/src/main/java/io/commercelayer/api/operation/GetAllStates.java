package io.commercelayer.api.operation;

import io.commercelayer.api.model.State;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAllStates
 */
public class GetAllStates extends SearchOperation<State> {

	public static final String OPERATION_PATH = "/all/states";


	public GetAllStates() {
		super(OPERATION_PATH);
	}
	

	public Class<State> getResourceType() {
		return State.class;
	}
	
}
