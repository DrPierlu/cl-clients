package io.commercelayer.api.operation;

import io.commercelayer.api.model.Language;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountLanguages
 */
public class GetAccountLanguages extends SearchOperation<Language> {

	public static final String OPERATION_PATH = "/account/languages";


	public GetAccountLanguages() {
		super(OPERATION_PATH);
	}
	

	public Class<Language> getResourceType() {
		return Language.class;
	}
	
}
