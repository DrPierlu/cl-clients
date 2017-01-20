package io.commercelayer.api.operation;

import io.commercelayer.api.model.Address;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountAddressesId
 */
public class PutAccountAddressesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/addresses/{id}";


	{
		addRequiredField("geocodingCountry");
		addRequiredField("geocodingZip");
		addRequiredField("geocodingCity");
		addRequiredField("geocodingStreet");
		addRequiredField("geocodingNumber");
		addRequiredField("id");
	}


	public PutAccountAddressesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountAddressesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Address.class;
	}
	
}
