package io.commercelayer.api.operation;

import io.commercelayer.api.model.Environment;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountEnvironmentsId
 */
public class GetAccountEnvironmentsId extends GetIdOperation<Environment> {

	public static final String OPERATION_PATH = "/account/environments/{id}";


	public GetAccountEnvironmentsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountEnvironmentsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Environment> getResourceType() {
		return Environment.class;
	}
	
}
