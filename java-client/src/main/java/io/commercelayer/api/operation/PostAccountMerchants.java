package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountMerchants
 */
public class PostAccountMerchants extends PostOperation {

	public static final String OPERATION_PATH = "/account/merchants";


	{
		addRequiredField("name");
		addRequiredField("countryId");
		addRequiredField("description");
	}


	public PostAccountMerchants() {
		super(OPERATION_PATH);
	}
	
}
