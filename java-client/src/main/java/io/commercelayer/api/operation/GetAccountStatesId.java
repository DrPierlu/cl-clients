package io.commercelayer.api.operation;

import io.commercelayer.api.model.State;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountStatesId
 */
public class GetAccountStatesId extends GetIdOperation<State> {

	public static final String OPERATION_PATH = "/account/states/{id}";


	public GetAccountStatesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountStatesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<State> getResourceType() {
		return State.class;
	}
	
}
