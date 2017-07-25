package io.commercelayer.api.operation;

import io.commercelayer.api.model.Country;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountCountriesId
 */
public class PutAccountCountriesId extends PutOperation<Country> {

	public static final String OPERATION_PATH = "/account/countries/{id}";


	{
		addRequiredField("countryGroupId");
		addRequiredField("code");
		addRequiredField("currencyId");
		addRequiredField("priceListIds");
		addRequiredField("stateIds");
		addRequiredField("orderIds");
		addRequiredField("lineItemIds");
		addRequiredField("invoiceIds");
		addRequiredField("customsItemIds");
		addRequiredField("countryLanguageIds");
		addRequiredField("languageIds");
	}


	public PutAccountCountriesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountCountriesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Country> getResourceType() {
		return Country.class;
	}
	
}
