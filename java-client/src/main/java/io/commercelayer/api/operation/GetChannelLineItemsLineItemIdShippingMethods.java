package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetChannelLineItemsLineItemIdShippingMethods
 */
public class GetChannelLineItemsLineItemIdShippingMethods extends SearchOperation {

	public static final String OPERATION_PATH = "/channel/line_items/{line_item_id}/shipping_methods";


	public GetChannelLineItemsLineItemIdShippingMethods() {
		super(OPERATION_PATH);
	}
	

	public void setLineItemId(Object lineItemId) {
		addPathParam("line_item_id", lineItemId);
	}
	

	public Object getLineItemId() {
		return getPathParam("line_item_id");
	}
	
}
