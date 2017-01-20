package io.commercelayer.api.operation;

import io.commercelayer.api.model.Application;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountApplicationsId
 */
public class DeleteAccountApplicationsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/applications/{id}";


	public DeleteAccountApplicationsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountApplicationsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Application.class;
	}
	
}
