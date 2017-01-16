package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountCountries
 */
public class GetAccountCountries extends SearchOperation {

	public static final String OPERATION_PATH = "/account/countries";


	public GetAccountCountries() {
		super(OPERATION_PATH);
	}
	
}
