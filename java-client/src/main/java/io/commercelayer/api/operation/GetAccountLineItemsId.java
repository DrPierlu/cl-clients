package io.commercelayer.api.operation;

import io.commercelayer.api.model.LineItem;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountLineItemsId
 */
public class GetAccountLineItemsId extends GetIdOperation<LineItem> {

	public static final String OPERATION_PATH = "/account/line_items/{id}";


	public GetAccountLineItemsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountLineItemsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<LineItem> getResourceType() {
		return LineItem.class;
	}
	
}
