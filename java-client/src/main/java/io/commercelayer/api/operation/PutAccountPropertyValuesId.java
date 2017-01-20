package io.commercelayer.api.operation;

import io.commercelayer.api.model.PropertyValue;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountPropertyValuesId
 */
public class PutAccountPropertyValuesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/property_values/{id}";


	{
		addRequiredField("propertyTypeId");
		addRequiredField("name");
		addRequiredField("id");
	}


	public PutAccountPropertyValuesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountPropertyValuesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return PropertyValue.class;
	}
	
}
