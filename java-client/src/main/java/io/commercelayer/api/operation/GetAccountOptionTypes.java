package io.commercelayer.api.operation;

import io.commercelayer.api.model.OptionType;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountOptionTypes
 */
public class GetAccountOptionTypes extends SearchOperation<OptionType> {

	public static final String OPERATION_PATH = "/account/option_types";


	public GetAccountOptionTypes() {
		super(OPERATION_PATH);
	}
	

	public Class<OptionType> getResourceType() {
		return OptionType.class;
	}
	
}
