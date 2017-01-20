package io.commercelayer.api.operation;

import io.commercelayer.api.model.OptionValue;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountOptionValuesId
 */
public class PutAccountOptionValuesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/option_values/{id}";


	{
		addRequiredField("optionTypeId");
		addRequiredField("name");
		addRequiredField("id");
	}


	public PutAccountOptionValuesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountOptionValuesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return OptionValue.class;
	}
	
}
