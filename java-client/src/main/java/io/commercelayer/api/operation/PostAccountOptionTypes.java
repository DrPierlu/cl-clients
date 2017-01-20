package io.commercelayer.api.operation;

import io.commercelayer.api.model.OptionType;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountOptionTypes
 */
public class PostAccountOptionTypes extends PostOperation<OptionType> {

	public static final String OPERATION_PATH = "/account/option_types";


	{
		addRequiredField("name");
		addRequiredField("productTypeId");
	}


	public PostAccountOptionTypes() {
		super(OPERATION_PATH);
	}
	

	public Class<OptionType> getResourceType() {
		return OptionType.class;
	}
	
}
