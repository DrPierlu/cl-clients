package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingPrice;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountShippingPrices
 */
public class GetAccountShippingPrices extends SearchOperation<ShippingPrice> {

	public static final String OPERATION_PATH = "/account/shipping_prices";


	public GetAccountShippingPrices() {
		super(OPERATION_PATH);
	}
	

	public Class<ShippingPrice> getResourceType() {
		return ShippingPrice.class;
	}
	
}
