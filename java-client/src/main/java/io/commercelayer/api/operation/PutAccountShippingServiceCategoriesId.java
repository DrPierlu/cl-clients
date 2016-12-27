package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountShippingServiceCategoriesId
 */
public class PutAccountShippingServiceCategoriesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/shipping_service_categories/{id}";


	{
		addRequiredField("shippingServiceId");
		addRequiredField("shippingCategoryId");
		addRequiredField("id");
	}

	public PutAccountShippingServiceCategoriesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShippingServiceCategoriesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
