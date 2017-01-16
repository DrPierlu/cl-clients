package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountLanguages
 */
public class GetAccountLanguages extends SearchOperation {

	public static final String OPERATION_PATH = "/account/languages";


	public GetAccountLanguages() {
		super(OPERATION_PATH);
	}
	
}
