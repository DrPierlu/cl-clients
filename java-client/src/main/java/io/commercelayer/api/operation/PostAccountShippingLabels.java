package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingLabel;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountShippingLabels
 */
public class PostAccountShippingLabels extends PostOperation<ShippingLabel> {

	public static final String OPERATION_PATH = "/account/shipping_labels";


	{
		addRequiredField("shipmentId");
	}


	public PostAccountShippingLabels() {
		super(OPERATION_PATH);
	}
	

	public Class<ShippingLabel> getResourceType() {
		return ShippingLabel.class;
	}
	
}
