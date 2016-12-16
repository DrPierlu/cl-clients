package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountCountries
 */
public class PostAccountCountries extends PostOperation {

	public static final String OPERATION_PATH = "/account/countries";


	public PostAccountCountries() {
		super(OPERATION_PATH);
	}
	
}
