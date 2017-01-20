package io.commercelayer.api.operation;

import io.commercelayer.api.model.State;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountStatesId
 */
public class PutAccountStatesId extends PutOperation<State> {

	public static final String OPERATION_PATH = "/account/states/{id}";


	{
		addRequiredField("countryId");
		addRequiredField("code");
		addRequiredField("id");
	}


	public PutAccountStatesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountStatesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<State> getResourceType() {
		return State.class;
	}
	
}
