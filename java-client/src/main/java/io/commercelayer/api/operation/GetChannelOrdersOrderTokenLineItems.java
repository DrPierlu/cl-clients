package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetChannelOrdersOrderTokenLineItems
 */
public class GetChannelOrdersOrderTokenLineItems extends SearchOperation {

	public static final String OPERATION_PATH = "/channel/orders/{order_token}/line_items";


	public GetChannelOrdersOrderTokenLineItems() {
		super(OPERATION_PATH);
	}
	
}
