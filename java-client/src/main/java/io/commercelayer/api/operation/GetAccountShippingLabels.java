package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountShippingLabels
 */
public class GetAccountShippingLabels extends SearchOperation {

	public static final String OPERATION_PATH = "/account/shipping_labels";


	public GetAccountShippingLabels() {
		super(OPERATION_PATH);
	}
	
}
