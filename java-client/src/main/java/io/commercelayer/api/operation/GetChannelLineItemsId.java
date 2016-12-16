package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;

/**
 * GetChannelLineItemsId
 */
public class GetChannelLineItemsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/channel/line_items/{id}";


	public GetChannelLineItemsId() {
		super(OPERATION_PATH);
	}
	

	public GetChannelLineItemsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
