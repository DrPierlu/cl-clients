package io.commercelayer.api.operation;

import io.commercelayer.api.model.PropertyValue;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountPropertyValuesId
 */
public class GetAccountPropertyValuesId extends GetIdOperation<PropertyValue> {

	public static final String OPERATION_PATH = "/account/property_values/{id}";


	public GetAccountPropertyValuesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountPropertyValuesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<PropertyValue> getResourceType() {
		return PropertyValue.class;
	}
	
}
