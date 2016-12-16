package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountShippingPackages
 */
public class PostAccountShippingPackages extends PostOperation {

	public static final String OPERATION_PATH = "/account/shipping_packages";


	public PostAccountShippingPackages() {
		super(OPERATION_PATH);
	}
	
}
