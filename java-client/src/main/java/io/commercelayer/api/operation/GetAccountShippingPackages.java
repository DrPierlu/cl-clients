package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingPackage;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountShippingPackages
 */
public class GetAccountShippingPackages extends SearchOperation {

	public static final String OPERATION_PATH = "/account/shipping_packages";


	public GetAccountShippingPackages() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return ShippingPackage.class;
	}
	
}
