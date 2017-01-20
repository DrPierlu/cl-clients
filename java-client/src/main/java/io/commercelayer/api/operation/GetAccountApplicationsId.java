package io.commercelayer.api.operation;

import io.commercelayer.api.model.Application;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountApplicationsId
 */
public class GetAccountApplicationsId extends GetIdOperation<Application> {

	public static final String OPERATION_PATH = "/account/applications/{id}";


	public GetAccountApplicationsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountApplicationsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Application> getResourceType() {
		return Application.class;
	}
	
}
