package io.commercelayer.api.operation;

import io.commercelayer.api.model.Country;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountCountries
 */
public class PostAccountCountries extends PostOperation<Country> {

	public static final String OPERATION_PATH = "/account/countries";


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


	public PostAccountCountries() {
		super(OPERATION_PATH);
	}
	

	public Class<Country> getResourceType() {
		return Country.class;
	}
	
}
