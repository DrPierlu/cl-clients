package io.commercelayer.api.operation;

import io.commercelayer.api.model.ResourceImage;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountResourceImages
 */
public class GetAccountResourceImages extends SearchOperation<ResourceImage> {

	public static final String OPERATION_PATH = "/account/resource_images";


	public GetAccountResourceImages() {
		super(OPERATION_PATH);
	}
	

	public Class<ResourceImage> getResourceType() {
		return ResourceImage.class;
	}
	
}
