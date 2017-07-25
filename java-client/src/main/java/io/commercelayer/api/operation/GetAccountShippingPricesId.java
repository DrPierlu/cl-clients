package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingPrice;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountShippingPricesId
 */
public class GetAccountShippingPricesId extends GetIdOperation<ShippingPrice> {

	public static final String OPERATION_PATH = "/account/shipping_prices/{id}";


	public GetAccountShippingPricesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountShippingPricesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingPrice> getResourceType() {
		return ShippingPrice.class;
	}
	
}
