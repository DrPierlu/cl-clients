package io.commercelayer.api.operation;

import io.commercelayer.api.model.Shipment;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountShipments
 */
public class PostAccountShipments extends PostOperation<Shipment> {

	public static final String OPERATION_PATH = "/account/shipments";


	{
		addRequiredField("orderId");
		addRequiredField("stockLocationId");
		addRequiredField("shippingMethodId");
	}


	public PostAccountShipments() {
		super(OPERATION_PATH);
	}
	

	public Class<Shipment> getResourceType() {
		return Shipment.class;
	}
	
}
