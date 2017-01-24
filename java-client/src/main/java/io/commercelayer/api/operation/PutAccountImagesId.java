package io.commercelayer.api.operation;

import io.commercelayer.api.model.Image;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountImagesId
 */
public class PutAccountImagesId extends PutOperation<Image> {

	public static final String OPERATION_PATH = "/account/images/{id}";


	{
		addRequiredField("attachment");
	}


	public PutAccountImagesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountImagesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Image> getResourceType() {
		return Image.class;
	}
	
}
