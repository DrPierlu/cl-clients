package io.commercelayer.api.operation;

import io.commercelayer.api.model.PropertyType;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountPropertyTypesId
 */
public class GetAccountPropertyTypesId extends GetIdOperation<PropertyType> {

	public static final String OPERATION_PATH = "/account/property_types/{id}";


	public GetAccountPropertyTypesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountPropertyTypesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<PropertyType> getResourceType() {
		return PropertyType.class;
	}
	
}
