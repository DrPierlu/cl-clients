package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountProductProperties
 */
public class PostAccountProductProperties extends PostOperation {

	public static final String OPERATION_PATH = "/account/product_properties";


	public PostAccountProductProperties() {
		super(OPERATION_PATH);
	}
	
}
