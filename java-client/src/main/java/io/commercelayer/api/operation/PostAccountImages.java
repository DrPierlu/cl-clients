package io.commercelayer.api.operation;

import io.commercelayer.api.model.Image;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountImages
 */
public class PostAccountImages extends PostOperation {

	public static final String OPERATION_PATH = "/account/images";


	{
		addRequiredField("attachment");
	}


	public PostAccountImages() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Image.class;
	}
	
}
