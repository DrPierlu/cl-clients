package io.commercelayer.api.operation;

import io.commercelayer.api.model.OptionType;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountOptionTypesId
 */
public class GetAccountOptionTypesId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/option_types/{id}";


	public GetAccountOptionTypesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountOptionTypesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return OptionType.class;
	}
	
}
