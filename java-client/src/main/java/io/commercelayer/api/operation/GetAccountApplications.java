package io.commercelayer.api.operation;

import io.commercelayer.api.model.Application;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountApplications
 */
public class GetAccountApplications extends SearchOperation<Application> {

	public static final String OPERATION_PATH = "/account/applications";


	public GetAccountApplications() {
		super(OPERATION_PATH);
	}
	

	public Class<Application> getResourceType() {
		return Application.class;
	}
	
}
