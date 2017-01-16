package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountShippingPackages
 */
public class GetAccountShippingPackages extends SearchOperation {

	public static final String OPERATION_PATH = "/account/shipping_packages";


	public GetAccountShippingPackages() {
		super(OPERATION_PATH);
	}
	
}
