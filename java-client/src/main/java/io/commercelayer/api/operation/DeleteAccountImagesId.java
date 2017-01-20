package io.commercelayer.api.operation;

import io.commercelayer.api.model.Image;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountImagesId
 */
public class DeleteAccountImagesId extends DeleteOperation<Image> {

	public static final String OPERATION_PATH = "/account/images/{id}";


	public DeleteAccountImagesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountImagesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Image> getResourceType() {
		return Image.class;
	}
	
}
