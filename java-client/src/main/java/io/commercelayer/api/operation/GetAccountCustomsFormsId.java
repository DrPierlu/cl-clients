package io.commercelayer.api.operation;

import io.commercelayer.api.model.CustomsForm;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountCustomsFormsId
 */
public class GetAccountCustomsFormsId extends GetIdOperation<CustomsForm> {

	public static final String OPERATION_PATH = "/account/customs_forms/{id}";


	public GetAccountCustomsFormsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountCustomsFormsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<CustomsForm> getResourceType() {
		return CustomsForm.class;
	}
	
}
