package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountAddresses
 */
public class PostAccountAddresses extends PostOperation {

	public static final String OPERATION_PATH = "/account/addresses";


	{
		addRequiredField("geocodingCountry");
		addRequiredField("geocodingZip");
		addRequiredField("geocodingCity");
		addRequiredField("geocodingStreet");
		addRequiredField("geocodingNumber");
	}


	public PostAccountAddresses() {
		super(OPERATION_PATH);
	}
	
}
