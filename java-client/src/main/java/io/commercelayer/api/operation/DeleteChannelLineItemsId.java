package io.commercelayer.api.operation;

import io.commercelayer.api.model.LineItem;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteChannelLineItemsId
 */
public class DeleteChannelLineItemsId extends DeleteOperation<LineItem> {

	public static final String OPERATION_PATH = "/channel/line_items/{id}";


	public DeleteChannelLineItemsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteChannelLineItemsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<LineItem> getResourceType() {
		return LineItem.class;
	}
	
}
