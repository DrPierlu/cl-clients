package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountVariants
 */
public class PostAccountVariants extends PostOperation {

	public static final String OPERATION_PATH = "/account/variants";


	public PostAccountVariants() {
		super(OPERATION_PATH);
	}
	
}
