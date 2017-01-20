package io.commercelayer.api.operation;

import io.commercelayer.api.model.ResourceImage;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountResourceImagesIdMoveAtPosition
 */
public class PutAccountResourceImagesIdMoveAtPosition extends MoveOperation<ResourceImage> {

	public static final String OPERATION_PATH = "/account/resource_images/{id}/move_at/{position}";


	public PutAccountResourceImagesIdMoveAtPosition() {
		super(OPERATION_PATH);
	}
	

	public PutAccountResourceImagesIdMoveAtPosition(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ResourceImage> getResourceType() {
		return ResourceImage.class;
	}
	
}
