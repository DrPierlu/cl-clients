package io.commercelayer.api.operation;

import io.commercelayer.api.model.CountryLanguage;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountCountryLanguagesIdMoveTop
 */
public class PutAccountCountryLanguagesIdMoveTop extends MoveOperation<CountryLanguage> {

	public static final String OPERATION_PATH = "/account/country_languages/{id}/move_top";


	public PutAccountCountryLanguagesIdMoveTop() {
		super(OPERATION_PATH);
	}
	

	public PutAccountCountryLanguagesIdMoveTop(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<CountryLanguage> getResourceType() {
		return CountryLanguage.class;
	}
	
}
