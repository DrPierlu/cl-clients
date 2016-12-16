package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountPropertyTypes
 */
public class PostAccountPropertyTypes extends PostOperation {

	public static final String OPERATION_PATH = "/account/property_types";


	public PostAccountPropertyTypes() {
		super(OPERATION_PATH);
	}
	
}
