package io.commercelayer.api.operation;

import io.commercelayer.api.model.Environment;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountEnvironments
 */
public class GetAccountEnvironments extends SearchOperation {

	public static final String OPERATION_PATH = "/account/environments";


	public GetAccountEnvironments() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Environment.class;
	}
	
}
