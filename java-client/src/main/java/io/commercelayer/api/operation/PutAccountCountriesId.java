package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountCountriesId
 */
public class PutAccountCountriesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/countries/{id}";


	public PutAccountCountriesId() {
		super(OPERATION_PATH);
	}
	
}
