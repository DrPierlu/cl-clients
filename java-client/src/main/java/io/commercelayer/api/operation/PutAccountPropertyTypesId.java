package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountPropertyTypesId
 */
public class PutAccountPropertyTypesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/property_types/{id}";


	public PutAccountPropertyTypesId() {
		super(OPERATION_PATH);
	}
	
}
