package io.commercelayer.api.operation;

import io.commercelayer.api.model.OptionValue;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountOptionValues
 */
public class PostAccountOptionValues extends PostOperation<OptionValue> {

	public static final String OPERATION_PATH = "/account/option_values";


	{
		addRequiredField("optionTypeId");
		addRequiredField("name");
	}


	public PostAccountOptionValues() {
		super(OPERATION_PATH);
	}
	

	public Class<OptionValue> getResourceType() {
		return OptionValue.class;
	}
	
}
