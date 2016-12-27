package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountOptionValues
 */
public class PostAccountOptionValues extends PostOperation {

	public static final String OPERATION_PATH = "/account/option_values";


	{
		addRequiredField("optionTypeId");
		addRequiredField("name");
	}

	public PostAccountOptionValues() {
		super(OPERATION_PATH);
	}
	
}
