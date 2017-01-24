package io.commercelayer.api.operation;

import io.commercelayer.api.model.OptionValue;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountOptionValuesId
 */
public class PutAccountOptionValuesId extends PutOperation<OptionValue> {

	public static final String OPERATION_PATH = "/account/option_values/{id}";


	{
		addRequiredField("optionTypeId");
		addRequiredField("name");
	}


	public PutAccountOptionValuesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountOptionValuesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<OptionValue> getResourceType() {
		return OptionValue.class;
	}
	
}
