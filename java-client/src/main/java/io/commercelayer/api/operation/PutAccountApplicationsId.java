package io.commercelayer.api.operation;

import io.commercelayer.api.model.Application;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountApplicationsId
 */
public class PutAccountApplicationsId extends PutOperation<Application> {

	public static final String OPERATION_PATH = "/account/applications/{id}";


	{
		addRequiredField("name");
	}


	public PutAccountApplicationsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountApplicationsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Application> getResourceType() {
		return Application.class;
	}
	
}
