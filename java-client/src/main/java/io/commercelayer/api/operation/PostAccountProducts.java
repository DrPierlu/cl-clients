package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountProducts
 */
public class PostAccountProducts extends PostOperation {

	public static final String OPERATION_PATH = "/account/products";


	public PostAccountProducts() {
		super(OPERATION_PATH);
	}
	
}
