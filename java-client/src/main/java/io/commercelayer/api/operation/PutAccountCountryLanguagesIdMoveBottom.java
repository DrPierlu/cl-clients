package io.commercelayer.api.operation;

import io.commercelayer.api.model.CountryLanguage;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountCountryLanguagesIdMoveBottom
 */
public class PutAccountCountryLanguagesIdMoveBottom extends MoveOperation<CountryLanguage> {

	public static final String OPERATION_PATH = "/account/country_languages/{id}/move_bottom";


	public PutAccountCountryLanguagesIdMoveBottom() {
		super(OPERATION_PATH);
	}
	

	public PutAccountCountryLanguagesIdMoveBottom(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<CountryLanguage> getResourceType() {
		return CountryLanguage.class;
	}
	
}
