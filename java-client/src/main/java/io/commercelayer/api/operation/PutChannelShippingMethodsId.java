package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingMethod;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutChannelShippingMethodsId
 */
public class PutChannelShippingMethodsId extends PutOperation<ShippingMethod> {

	public static final String OPERATION_PATH = "/channel/shipping_methods/{id}";


	{
		addRequiredField("shippingServiceId");
		addRequiredField("shippingPackageId");
		addRequiredField("shippingAddressId");
		addRequiredField("shippingAddressAttributes");
		addRequiredField("shippingRecipientId");
		addRequiredField("shippingRecipientAttributes");
		addRequiredField("shipmentIds");
		addRequiredField("lineItemIds");
	}


	public PutChannelShippingMethodsId() {
		super(OPERATION_PATH);
	}
	

	public PutChannelShippingMethodsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingMethod> getResourceType() {
		return ShippingMethod.class;
	}
	
}
