package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountTaxons
 */
public class PostAccountTaxons extends PostOperation {

	public static final String OPERATION_PATH = "/account/taxons";


	{
		addRequiredField("taxonomyId");
		addRequiredField("name");
		addRequiredField("parentId");
	}


	public PostAccountTaxons() {
		super(OPERATION_PATH);
	}
	
}
