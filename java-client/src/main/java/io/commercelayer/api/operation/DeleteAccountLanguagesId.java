package io.commercelayer.api.operation;

import io.commercelayer.api.model.Language;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountLanguagesId
 */
public class DeleteAccountLanguagesId extends DeleteOperation<Language> {

	public static final String OPERATION_PATH = "/account/languages/{id}";


	public DeleteAccountLanguagesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountLanguagesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Language> getResourceType() {
		return Language.class;
	}
	
}
