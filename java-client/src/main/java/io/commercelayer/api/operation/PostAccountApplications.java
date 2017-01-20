package io.commercelayer.api.operation;

import io.commercelayer.api.model.Application;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountApplications
 */
public class PostAccountApplications extends PostOperation {

	public static final String OPERATION_PATH = "/account/applications";


	{
		addRequiredField("name");
	}


	public PostAccountApplications() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Application.class;
	}
	
}
