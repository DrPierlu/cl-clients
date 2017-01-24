package io.commercelayer.api.operation;

import io.commercelayer.api.model.Environment;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountEnvironmentsId
 */
public class PutAccountEnvironmentsId extends PutOperation<Environment> {

	public static final String OPERATION_PATH = "/account/environments/{id}";


	{
		addRequiredField("name");
		addRequiredField("organizationId");
	}


	public PutAccountEnvironmentsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountEnvironmentsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Environment> getResourceType() {
		return Environment.class;
	}
	
}
