package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountLanguagesId
 */
public class PutAccountLanguagesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/languages/{id}";


	{
		addRequiredField("code");
		addRequiredField("id");
	}


	public PutAccountLanguagesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountLanguagesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
