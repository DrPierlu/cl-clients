package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountCatalogs
 */
public class PostAccountCatalogs extends PostOperation {

	public static final String OPERATION_PATH = "/account/catalogs";


	{
		addRequiredField("name");
		addRequiredField("description");
	}


	public PostAccountCatalogs() {
		super(OPERATION_PATH);
	}
	
}
