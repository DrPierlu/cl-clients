package io.commercelayer.api.operation;

import io.commercelayer.api.model.Language;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountLanguagesId
 */
public class GetAccountLanguagesId extends GetIdOperation<Language> {

	public static final String OPERATION_PATH = "/account/languages/{id}";


	public GetAccountLanguagesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountLanguagesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Language> getResourceType() {
		return Language.class;
	}
	
}
