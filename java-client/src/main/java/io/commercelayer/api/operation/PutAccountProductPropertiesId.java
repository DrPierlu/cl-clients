package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountProductPropertiesId
 */
public class PutAccountProductPropertiesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/product_properties/{id}";


	{
		addRequiredField("productId");
		addRequiredField("propertyValueId");
		addRequiredField("id");
	}


	public PutAccountProductPropertiesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountProductPropertiesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
