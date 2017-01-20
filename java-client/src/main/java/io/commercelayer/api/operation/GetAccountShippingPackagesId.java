package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingPackage;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountShippingPackagesId
 */
public class GetAccountShippingPackagesId extends GetIdOperation<ShippingPackage> {

	public static final String OPERATION_PATH = "/account/shipping_packages/{id}";


	public GetAccountShippingPackagesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountShippingPackagesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingPackage> getResourceType() {
		return ShippingPackage.class;
	}
	
}
