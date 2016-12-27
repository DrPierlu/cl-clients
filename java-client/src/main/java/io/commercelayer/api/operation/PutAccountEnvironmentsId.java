package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountEnvironmentsId
 */
public class PutAccountEnvironmentsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/environments/{id}";


	{
		addRequiredField("name");
		addRequiredField("organizationId");
		addRequiredField("id");
	}

	public PutAccountEnvironmentsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountEnvironmentsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
