package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutChannelLineItemsId
 */
public class PutChannelLineItemsId extends PutOperation {

	public static final String OPERATION_PATH = "/channel/line_items/{id}";


	public PutChannelLineItemsId() {
		super(OPERATION_PATH);
	}
	
}
