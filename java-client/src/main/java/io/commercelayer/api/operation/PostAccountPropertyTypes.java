package io.commercelayer.api.operation;

import io.commercelayer.api.model.PropertyType;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountPropertyTypes
 */
public class PostAccountPropertyTypes extends PostOperation<PropertyType> {

	public static final String OPERATION_PATH = "/account/property_types";


	{
		addRequiredField("name");
		addRequiredField("productTypeId");
	}


	public PostAccountPropertyTypes() {
		super(OPERATION_PATH);
	}
	

	public Class<PropertyType> getResourceType() {
		return PropertyType.class;
	}
	
}
