package io.commercelayer.api.operation;

import io.commercelayer.api.model.ResourceImage;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountResourceImagesIdMoveTop
 */
public class PutAccountResourceImagesIdMoveTop extends MoveOperation {

	public static final String OPERATION_PATH = "/account/resource_images/{id}/move_top";


	public PutAccountResourceImagesIdMoveTop() {
		super(OPERATION_PATH);
	}
	

	public PutAccountResourceImagesIdMoveTop(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ResourceImage.class;
	}
	
}
