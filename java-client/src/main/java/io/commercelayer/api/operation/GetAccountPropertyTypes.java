package io.commercelayer.api.operation;

import io.commercelayer.api.model.PropertyType;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountPropertyTypes
 */
public class GetAccountPropertyTypes extends SearchOperation {

	public static final String OPERATION_PATH = "/account/property_types";


	public GetAccountPropertyTypes() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return PropertyType.class;
	}
	
}
