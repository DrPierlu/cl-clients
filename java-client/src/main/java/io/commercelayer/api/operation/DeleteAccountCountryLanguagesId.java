package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountCountryLanguagesId
 */
public class DeleteAccountCountryLanguagesId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/country_languages/{id}";


	public DeleteAccountCountryLanguagesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountCountryLanguagesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
