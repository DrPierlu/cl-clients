package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetChannelLineItemsLineItemIdLineItemStocks
 */
public class GetChannelLineItemsLineItemIdLineItemStocks extends SearchOperation {

	public static final String OPERATION_PATH = "/channel/line_items/{line_item_id}/line_item_stocks";


	public GetChannelLineItemsLineItemIdLineItemStocks() {
		super(OPERATION_PATH);
	}
	

	public void setLineItemId(Object lineItemId) {
		addPathParam("line_item_id", lineItemId);
	}
	

	public Object getLineItemId() {
		return getPathParam("line_item_id");
	}
	
}
