package io.commercelayer.api.operation;

import io.commercelayer.api.model.PropertyValue;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountPropertyValues
 */
public class GetAccountPropertyValues extends SearchOperation {

	public static final String OPERATION_PATH = "/account/property_values";


	public GetAccountPropertyValues() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return PropertyValue.class;
	}
	
}
