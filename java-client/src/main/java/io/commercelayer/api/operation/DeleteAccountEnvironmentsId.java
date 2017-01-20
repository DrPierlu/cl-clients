package io.commercelayer.api.operation;

import io.commercelayer.api.model.Environment;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountEnvironmentsId
 */
public class DeleteAccountEnvironmentsId extends DeleteOperation<Environment> {

	public static final String OPERATION_PATH = "/account/environments/{id}";


	public DeleteAccountEnvironmentsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountEnvironmentsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Environment> getResourceType() {
		return Environment.class;
	}
	
}
