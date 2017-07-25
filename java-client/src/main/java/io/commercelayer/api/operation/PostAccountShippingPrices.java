package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingPrice;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountShippingPrices
 */
public class PostAccountShippingPrices extends PostOperation<ShippingPrice> {

	public static final String OPERATION_PATH = "/account/shipping_prices";


	{
		addRequiredField("priceListId");
		addRequiredField("shippingServiceId");
		addRequiredField("amount");
		addRequiredField("freeOverAmount");
	}


	public PostAccountShippingPrices() {
		super(OPERATION_PATH);
	}
	

	public Class<ShippingPrice> getResourceType() {
		return ShippingPrice.class;
	}
	
}
