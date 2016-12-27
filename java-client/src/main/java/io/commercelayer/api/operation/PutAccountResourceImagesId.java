package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountResourceImagesId
 */
public class PutAccountResourceImagesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/resource_images/{id}";


	{
		addRequiredField("imageableResource");
		addRequiredField("imageableId");
		addRequiredField("imageId");
		addRequiredField("id");
	}


	public PutAccountResourceImagesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountResourceImagesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
