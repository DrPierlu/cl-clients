package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccounts
 */
public class PostAccounts extends PostOperation {

	public static final String OPERATION_PATH = "/accounts";


	{
		addRequiredField("name");
		addRequiredField("adminFirstName");
		addRequiredField("adminLastName");
		addRequiredField("adminEmail");
		addRequiredField("adminPassword");
		addRequiredField("adminPasswordConfirmation");
		addRequiredField("merchantGeocodingCountry");
		addRequiredField("merchantGeocodingZip");
		addRequiredField("merchantGeocodingCity");
		addRequiredField("merchantGeocodingStreet");
		addRequiredField("merchantGeocodingNumber");
	}


	public PostAccounts() {
		super(OPERATION_PATH);
	}
	
}
