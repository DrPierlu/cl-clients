package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountResourceImages
 */
public class PostAccountResourceImages extends PostOperation {

	public static final String OPERATION_PATH = "/account/resource_images";


	public PostAccountResourceImages() {
		super(OPERATION_PATH);
	}
	
}
