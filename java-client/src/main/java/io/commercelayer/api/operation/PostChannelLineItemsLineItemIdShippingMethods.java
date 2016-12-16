package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostChannelLineItemsLineItemIdShippingMethods
 */
public class PostChannelLineItemsLineItemIdShippingMethods extends PostOperation {

	public static final String OPERATION_PATH = "/channel/line_items/{line_item_id}/shipping_methods";


	public PostChannelLineItemsLineItemIdShippingMethods() {
		super(OPERATION_PATH);
	}
	
}
