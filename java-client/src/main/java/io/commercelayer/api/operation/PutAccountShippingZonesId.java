package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountShippingZonesId
 */
public class PutAccountShippingZonesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/shipping_zones/{id}";


	{
		addRequiredField("name");
		addRequiredField("countryGroupId");
		addRequiredField("countryCodeRegex");
		addRequiredField("notCountryCodeRegex");
		addRequiredField("stateCodeRegex");
		addRequiredField("notStateCodeRegex");
		addRequiredField("zipCodeRegex");
		addRequiredField("notZipCodeRegex");
		addRequiredField("id");
	}


	public PutAccountShippingZonesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShippingZonesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
