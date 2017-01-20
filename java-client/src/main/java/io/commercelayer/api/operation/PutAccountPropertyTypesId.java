package io.commercelayer.api.operation;

import io.commercelayer.api.model.PropertyType;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountPropertyTypesId
 */
public class PutAccountPropertyTypesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/property_types/{id}";


	{
		addRequiredField("name");
		addRequiredField("productTypeId");
		addRequiredField("id");
	}


	public PutAccountPropertyTypesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountPropertyTypesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return PropertyType.class;
	}
	
}
