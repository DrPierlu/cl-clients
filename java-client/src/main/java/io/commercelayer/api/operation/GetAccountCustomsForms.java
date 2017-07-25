package io.commercelayer.api.operation;

import io.commercelayer.api.model.CustomsForm;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountCustomsForms
 */
public class GetAccountCustomsForms extends SearchOperation<CustomsForm> {

	public static final String OPERATION_PATH = "/account/customs_forms";


	public GetAccountCustomsForms() {
		super(OPERATION_PATH);
	}
	

	public Class<CustomsForm> getResourceType() {
		return CustomsForm.class;
	}
	
}
