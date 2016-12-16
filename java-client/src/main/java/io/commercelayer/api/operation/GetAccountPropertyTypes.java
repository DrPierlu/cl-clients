package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAccountPropertyTypes
 */
public class GetAccountPropertyTypes extends SearchOperation {

	public static final String OPERATION_PATH = "/account/property_types";


	public GetAccountPropertyTypes() {
		super(OPERATION_PATH);
	}
	
}
