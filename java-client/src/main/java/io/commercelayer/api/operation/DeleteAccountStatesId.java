package io.commercelayer.api.operation;

import io.commercelayer.api.model.State;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountStatesId
 */
public class DeleteAccountStatesId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/states/{id}";


	public DeleteAccountStatesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountStatesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return State.class;
	}
	
}
