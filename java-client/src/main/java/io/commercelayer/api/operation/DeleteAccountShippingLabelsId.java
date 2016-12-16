package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;

/**
 * DeleteAccountShippingLabelsId
 */
public class DeleteAccountShippingLabelsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/shipping_labels/{id}";


	public DeleteAccountShippingLabelsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountShippingLabelsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
