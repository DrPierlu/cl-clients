package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingLabel;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountShippingLabelsId
 */
public class PutAccountShippingLabelsId extends PutOperation<ShippingLabel> {

	public static final String OPERATION_PATH = "/account/shipping_labels/{id}";


	{
		addRequiredField("shipmentId");
		addRequiredField("id");
	}


	public PutAccountShippingLabelsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShippingLabelsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingLabel> getResourceType() {
		return ShippingLabel.class;
	}
	
}
