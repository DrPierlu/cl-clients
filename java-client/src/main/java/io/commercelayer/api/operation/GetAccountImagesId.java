package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountImagesId
 */
public class GetAccountImagesId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/images/{id}";


	public GetAccountImagesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountImagesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
