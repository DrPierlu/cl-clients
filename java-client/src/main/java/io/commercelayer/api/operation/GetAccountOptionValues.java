package io.commercelayer.api.operation;

import io.commercelayer.api.model.OptionValue;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountOptionValues
 */
public class GetAccountOptionValues extends SearchOperation<OptionValue> {

	public static final String OPERATION_PATH = "/account/option_values";


	public GetAccountOptionValues() {
		super(OPERATION_PATH);
	}
	

	public Class<OptionValue> getResourceType() {
		return OptionValue.class;
	}
	
}
