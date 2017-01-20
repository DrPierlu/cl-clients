package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingLabel;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountShippingLabelsId
 */
public class DeleteAccountShippingLabelsId extends DeleteOperation<ShippingLabel> {

	public static final String OPERATION_PATH = "/account/shipping_labels/{id}";


	public DeleteAccountShippingLabelsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountShippingLabelsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingLabel> getResourceType() {
		return ShippingLabel.class;
	}
	
}
