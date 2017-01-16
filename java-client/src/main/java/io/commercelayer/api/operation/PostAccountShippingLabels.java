package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountShippingLabels
 */
public class PostAccountShippingLabels extends PostOperation {

	public static final String OPERATION_PATH = "/account/shipping_labels";


	{
		addRequiredField("shipmentId");
	}


	public PostAccountShippingLabels() {
		super(OPERATION_PATH);
	}
	
}
