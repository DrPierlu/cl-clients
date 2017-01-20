package io.commercelayer.api.operation;

import io.commercelayer.api.model.PropertyValue;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountPropertyValuesId
 */
public class GetAccountPropertyValuesId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/property_values/{id}";


	public GetAccountPropertyValuesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountPropertyValuesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return PropertyValue.class;
	}
	
}
