package io.commercelayer.api.operation;

import io.commercelayer.api.model.Language;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountLanguages
 */
public class GetAccountLanguages extends SearchOperation {

	public static final String OPERATION_PATH = "/account/languages";


	public GetAccountLanguages() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Language.class;
	}
	
}
