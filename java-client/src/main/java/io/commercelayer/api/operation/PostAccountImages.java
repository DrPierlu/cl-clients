package io.commercelayer.api.operation;

import io.commercelayer.api.model.Image;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountImages
 */
public class PostAccountImages extends PostOperation<Image> {

	public static final String OPERATION_PATH = "/account/images";


	{
		addRequiredField("attachment");
	}


	public PostAccountImages() {
		super(OPERATION_PATH);
	}
	

	public Class<Image> getResourceType() {
		return Image.class;
	}
	
}
