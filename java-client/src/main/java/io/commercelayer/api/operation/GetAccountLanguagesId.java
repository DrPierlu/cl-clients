package io.commercelayer.api.operation;

import io.commercelayer.api.model.Language;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountLanguagesId
 */
public class GetAccountLanguagesId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/languages/{id}";


	public GetAccountLanguagesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountLanguagesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Language.class;
	}
	
}
