package io.commercelayer.api.operation;

import io.commercelayer.api.model.ResourceImage;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountResourceImagesId
 */
public class GetAccountResourceImagesId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/resource_images/{id}";


	public GetAccountResourceImagesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountResourceImagesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ResourceImage.class;
	}
	
}
