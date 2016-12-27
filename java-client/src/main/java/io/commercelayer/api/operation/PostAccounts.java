package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccounts
 */
public class PostAccounts extends PostOperation {

	public static final String OPERATION_PATH = "/accounts";


	{
		addRequiredField("name");
		addRequiredField("ownerFirstName");
		addRequiredField("ownerLastName");
		addRequiredField("ownerEmail");
		addRequiredField("ownerPassword");
		addRequiredField("ownerPasswordConfirmation");
		addRequiredField("merchantCountryCode");
	}

	public PostAccounts() {
		super(OPERATION_PATH);
	}
	
}
