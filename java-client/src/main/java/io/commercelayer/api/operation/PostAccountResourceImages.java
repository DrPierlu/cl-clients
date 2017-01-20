package io.commercelayer.api.operation;

import io.commercelayer.api.model.ResourceImage;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountResourceImages
 */
public class PostAccountResourceImages extends PostOperation<ResourceImage> {

	public static final String OPERATION_PATH = "/account/resource_images";


	{
		addRequiredField("imageableResource");
		addRequiredField("imageableId");
		addRequiredField("imageId");
	}


	public PostAccountResourceImages() {
		super(OPERATION_PATH);
	}
	

	public Class<ResourceImage> getResourceType() {
		return ResourceImage.class;
	}
	
}
