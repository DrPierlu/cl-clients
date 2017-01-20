package io.commercelayer.api.operation;

import io.commercelayer.api.model.PropertyType;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountPropertyTypes
 */
public class GetAccountPropertyTypes extends SearchOperation<PropertyType> {

	public static final String OPERATION_PATH = "/account/property_types";


	public GetAccountPropertyTypes() {
		super(OPERATION_PATH);
	}
	

	public Class<PropertyType> getResourceType() {
		return PropertyType.class;
	}
	
}
