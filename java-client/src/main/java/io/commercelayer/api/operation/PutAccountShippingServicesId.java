package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingService;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountShippingServicesId
 */
public class PutAccountShippingServicesId extends PutOperation<ShippingService> {

	public static final String OPERATION_PATH = "/account/shipping_services/{id}";


	{
		addRequiredField("name");
		addRequiredField("kind");
		addRequiredField("shippingCarrierAccountId");
	}


	public PutAccountShippingServicesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShippingServicesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingService> getResourceType() {
		return ShippingService.class;
	}
	
}
