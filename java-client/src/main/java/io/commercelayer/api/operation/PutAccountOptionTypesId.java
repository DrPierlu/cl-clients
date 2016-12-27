package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountOptionTypesId
 */
public class PutAccountOptionTypesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/option_types/{id}";


	{
		addRequiredField("name");
		addRequiredField("productTypeId");
		addRequiredField("id");
	}

	public PutAccountOptionTypesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountOptionTypesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
