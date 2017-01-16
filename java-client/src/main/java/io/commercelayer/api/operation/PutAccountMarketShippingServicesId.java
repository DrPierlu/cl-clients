package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountMarketShippingServicesId
 */
public class PutAccountMarketShippingServicesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/market_shipping_services/{id}";


	{
		addRequiredField("marketId");
		addRequiredField("shippingServiceId");
		addRequiredField("price");
		addRequiredField("freeOverAmount");
		addRequiredField("id");
	}


	public PutAccountMarketShippingServicesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountMarketShippingServicesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
