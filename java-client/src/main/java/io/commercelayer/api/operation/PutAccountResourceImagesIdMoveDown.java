package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountResourceImagesIdMoveDown
 */
public class PutAccountResourceImagesIdMoveDown extends MoveOperation {

	public static final String OPERATION_PATH = "/account/resource_images/{id}/move_down";


	public PutAccountResourceImagesIdMoveDown() {
		super(OPERATION_PATH);
	}
	

	public PutAccountResourceImagesIdMoveDown(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
