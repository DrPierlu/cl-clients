package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountLanguages
 */
public class PostAccountLanguages extends PostOperation {

	public static final String OPERATION_PATH = "/account/languages";


	public PostAccountLanguages() {
		super(OPERATION_PATH);
	}
	
}
