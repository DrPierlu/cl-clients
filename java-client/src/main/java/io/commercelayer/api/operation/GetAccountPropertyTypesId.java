package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;

/**
 * GetAccountPropertyTypesId
 */
public class GetAccountPropertyTypesId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/property_types/{id}";


	public GetAccountPropertyTypesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountPropertyTypesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
