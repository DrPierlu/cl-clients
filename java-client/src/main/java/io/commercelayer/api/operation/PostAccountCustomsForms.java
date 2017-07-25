package io.commercelayer.api.operation;

import io.commercelayer.api.model.CustomsForm;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountCustomsForms
 */
public class PostAccountCustomsForms extends PostOperation<CustomsForm> {

	public static final String OPERATION_PATH = "/account/customs_forms";


	{
		addRequiredField("shipmentId");
	}


	public PostAccountCustomsForms() {
		super(OPERATION_PATH);
	}
	

	public Class<CustomsForm> getResourceType() {
		return CustomsForm.class;
	}
	
}
