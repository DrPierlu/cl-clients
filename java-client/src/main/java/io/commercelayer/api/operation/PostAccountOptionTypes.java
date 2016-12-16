package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountOptionTypes
 */
public class PostAccountOptionTypes extends PostOperation {

	public static final String OPERATION_PATH = "/account/option_types";


	public PostAccountOptionTypes() {
		super(OPERATION_PATH);
	}
	
}
