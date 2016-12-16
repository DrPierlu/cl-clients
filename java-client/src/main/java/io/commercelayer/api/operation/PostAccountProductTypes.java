package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountProductTypes
 */
public class PostAccountProductTypes extends PostOperation {

	public static final String OPERATION_PATH = "/account/product_types";


	public PostAccountProductTypes() {
		super(OPERATION_PATH);
	}
	
}
