package io.commercelayer.api.operation;

import io.commercelayer.api.model.Language;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountLanguagesId
 */
public class PutAccountLanguagesId extends PutOperation<Language> {

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
	

	public Class<Language> getResourceType() {
		return Language.class;
	}
	
}
