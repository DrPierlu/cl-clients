package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingPrice;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountShippingPricesId
 */
public class DeleteAccountShippingPricesId extends DeleteOperation<ShippingPrice> {

	public static final String OPERATION_PATH = "/account/shipping_prices/{id}";


	public DeleteAccountShippingPricesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountShippingPricesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingPrice> getResourceType() {
		return ShippingPrice.class;
	}
	
}
