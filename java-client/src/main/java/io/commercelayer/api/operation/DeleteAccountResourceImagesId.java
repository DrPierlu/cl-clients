package io.commercelayer.api.operation;

import io.commercelayer.api.model.ResourceImage;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountResourceImagesId
 */
public class DeleteAccountResourceImagesId extends DeleteOperation<ResourceImage> {

	public static final String OPERATION_PATH = "/account/resource_images/{id}";


	public DeleteAccountResourceImagesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountResourceImagesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ResourceImage> getResourceType() {
		return ResourceImage.class;
	}
	
}
