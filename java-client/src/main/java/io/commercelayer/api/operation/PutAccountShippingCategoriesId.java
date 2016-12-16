package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountShippingCategoriesId
 */
public class PutAccountShippingCategoriesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/shipping_categories/{id}";


	public PutAccountShippingCategoriesId() {
		super(OPERATION_PATH);
	}
	
}
