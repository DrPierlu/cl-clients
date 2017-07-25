package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.HeadOperation;


/**
 * HeadHealthcheck
 */
public class HeadHealthcheck extends HeadOperation {

	public static final String OPERATION_PATH = "/healthcheck";


	public HeadHealthcheck() {
		super(OPERATION_PATH);
	}
	
}
