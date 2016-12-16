package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAccountShippingServiceCategories
 */
public class GetAccountShippingServiceCategories extends SearchOperation {

	public static final String OPERATION_PATH = "/account/shipping_service_categories";


	public GetAccountShippingServiceCategories() {
		super(OPERATION_PATH);
	}
	
}
