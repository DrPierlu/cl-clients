package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountProductTypesId
 */
public class PutAccountProductTypesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/product_types/{id}";


	{
		addRequiredField("name");
		addRequiredField("id");
	}


	public PutAccountProductTypesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountProductTypesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
