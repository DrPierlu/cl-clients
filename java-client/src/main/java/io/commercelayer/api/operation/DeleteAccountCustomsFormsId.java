package io.commercelayer.api.operation;

import io.commercelayer.api.model.CustomsForm;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountCustomsFormsId
 */
public class DeleteAccountCustomsFormsId extends DeleteOperation<CustomsForm> {

	public static final String OPERATION_PATH = "/account/customs_forms/{id}";


	public DeleteAccountCustomsFormsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountCustomsFormsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<CustomsForm> getResourceType() {
		return CustomsForm.class;
	}
	
}
