package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetSchema
 */
public class GetSchema extends SearchOperation {

	public static final String OPERATION_PATH = "/schema";


	public GetSchema() {
		super(OPERATION_PATH);
	}
	
}
