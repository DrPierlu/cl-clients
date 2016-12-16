package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountShippingLabelsId
 */
public class PutAccountShippingLabelsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/shipping_labels/{id}";


	public PutAccountShippingLabelsId() {
		super(OPERATION_PATH);
	}
	
}
