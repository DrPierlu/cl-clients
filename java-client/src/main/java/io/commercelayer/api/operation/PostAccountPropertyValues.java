package io.commercelayer.api.operation;

import io.commercelayer.api.model.PropertyValue;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountPropertyValues
 */
public class PostAccountPropertyValues extends PostOperation<PropertyValue> {

	public static final String OPERATION_PATH = "/account/property_values";


	{
		addRequiredField("propertyTypeId");
		addRequiredField("name");
	}


	public PostAccountPropertyValues() {
		super(OPERATION_PATH);
	}
	

	public Class<PropertyValue> getResourceType() {
		return PropertyValue.class;
	}
	
}
