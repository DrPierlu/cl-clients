package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountShippingZones
 */
public class PostAccountShippingZones extends PostOperation {

	public static final String OPERATION_PATH = "/account/shipping_zones";


	{
		addRequiredField("name");
		addRequiredField("countryGroupId");
		addRequiredField("countryCodeRegex");
		addRequiredField("notCountryCodeRegex");
		addRequiredField("stateCodeRegex");
		addRequiredField("notStateCodeRegex");
		addRequiredField("zipCodeRegex");
		addRequiredField("notZipCodeRegex");
	}

	public PostAccountShippingZones() {
		super(OPERATION_PATH);
	}
	
}
