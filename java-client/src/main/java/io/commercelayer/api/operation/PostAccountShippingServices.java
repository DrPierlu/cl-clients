package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountShippingServices
 */
public class PostAccountShippingServices extends PostOperation {

	public static final String OPERATION_PATH = "/account/shipping_services";


	public PostAccountShippingServices() {
		super(OPERATION_PATH);
	}
	
}
