package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountImagesId
 */
public class PutAccountImagesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/images/{id}";


	{
		addRequiredField("attachment");
		addRequiredField("id");
	}


	public PutAccountImagesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountImagesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
