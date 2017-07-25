package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingZone;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountShippingZones
 */
public class PostAccountShippingZones extends PostOperation<ShippingZone> {

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
		addRequiredField("shippingServiceZoneIds");
		addRequiredField("shippingServiceIds");
	}


	public PostAccountShippingZones() {
		super(OPERATION_PATH);
	}
	

	public Class<ShippingZone> getResourceType() {
		return ShippingZone.class;
	}
	
}
