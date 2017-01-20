package io.commercelayer.api.operation;

import io.commercelayer.api.model.LineItem;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountLineItems
 */
public class GetAccountLineItems extends SearchOperation<LineItem> {

	public static final String OPERATION_PATH = "/account/line_items";


	public GetAccountLineItems() {
		super(OPERATION_PATH);
	}
	

	public Class<LineItem> getResourceType() {
		return LineItem.class;
	}
	
}
