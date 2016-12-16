package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountVariantOptions
 */
public class PostAccountVariantOptions extends PostOperation {

	public static final String OPERATION_PATH = "/account/variant_options";


	public PostAccountVariantOptions() {
		super(OPERATION_PATH);
	}
	
}
