package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountLineItemsId
 */
public class PutAccountLineItemsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/line_items/{id}";


	public PutAccountLineItemsId() {
		super(OPERATION_PATH);
	}
	
}
