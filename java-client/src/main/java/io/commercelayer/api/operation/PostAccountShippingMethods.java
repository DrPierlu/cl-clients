package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountShippingMethods
 */
public class PostAccountShippingMethods extends PostOperation {

	public static final String OPERATION_PATH = "/account/shipping_methods";


	public PostAccountShippingMethods() {
		super(OPERATION_PATH);
	}
	
}
