package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountLanguagesId
 */
public class PutAccountLanguagesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/languages/{id}";


	public PutAccountLanguagesId() {
		super(OPERATION_PATH);
	}
	
}
