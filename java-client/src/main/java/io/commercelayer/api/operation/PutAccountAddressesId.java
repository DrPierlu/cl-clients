package io.commercelayer.api.operation;

import io.commercelayer.api.model.Address;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountAddressesId
 */
public class PutAccountAddressesId extends PutOperation<Address> {

	public static final String OPERATION_PATH = "/account/addresses/{id}";


	{
		addRequiredField("geocodingCountry");
		addRequiredField("geocodingZip");
		addRequiredField("geocodingCity");
		addRequiredField("geocodingStreet");
		addRequiredField("geocodingNumber");
	}


	public PutAccountAddressesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountAddressesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Address> getResourceType() {
		return Address.class;
	}
	
}
