package io.commercelayer.api.operation;

import io.commercelayer.api.model.State;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetPublicStates
 */
public class GetPublicStates extends SearchOperation<State> {

	public static final String OPERATION_PATH = "/public/states";


	public GetPublicStates() {
		super(OPERATION_PATH);
	}
	

	public Class<State> getResourceType() {
		return State.class;
	}
	
}
