package io.commercelayer.api.operation;

import io.commercelayer.api.model.CustomsForm;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountCustomsFormsId
 */
public class PutAccountCustomsFormsId extends PutOperation<CustomsForm> {

	public static final String OPERATION_PATH = "/account/customs_forms/{id}";


	{
		addRequiredField("shipmentId");
	}


	public PutAccountCustomsFormsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountCustomsFormsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<CustomsForm> getResourceType() {
		return CustomsForm.class;
	}
	
}
