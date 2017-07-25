package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingPrice;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountShippingPricesId
 */
public class PutAccountShippingPricesId extends PutOperation<ShippingPrice> {

	public static final String OPERATION_PATH = "/account/shipping_prices/{id}";


	{
		addRequiredField("priceListId");
		addRequiredField("shippingServiceId");
		addRequiredField("amount");
		addRequiredField("freeOverAmount");
	}


	public PutAccountShippingPricesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShippingPricesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingPrice> getResourceType() {
		return ShippingPrice.class;
	}
	
}
