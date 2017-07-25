package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingZone;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountShippingZonesId
 */
public class PutAccountShippingZonesId extends PutOperation<ShippingZone> {

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
		addRequiredField("shippingServiceZoneIds");
		addRequiredField("shippingServiceIds");
	}


	public PutAccountShippingZonesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShippingZonesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingZone> getResourceType() {
		return ShippingZone.class;
	}
	
}
