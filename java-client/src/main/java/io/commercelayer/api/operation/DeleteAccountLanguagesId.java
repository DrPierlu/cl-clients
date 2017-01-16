package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountLanguagesId
 */
public class DeleteAccountLanguagesId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/languages/{id}";


	public DeleteAccountLanguagesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountLanguagesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
