package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountPropertyValuesId
 */
public class PutAccountPropertyValuesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/property_values/{id}";


	public PutAccountPropertyValuesId() {
		super(OPERATION_PATH);
	}
	
}
