package io.commercelayer.api.operation;

import io.commercelayer.api.model.Country;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountCountriesId
 */
public class DeleteAccountCountriesId extends DeleteOperation<Country> {

	public static final String OPERATION_PATH = "/account/countries/{id}";


	public DeleteAccountCountriesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountCountriesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Country> getResourceType() {
		return Country.class;
	}
	
}
