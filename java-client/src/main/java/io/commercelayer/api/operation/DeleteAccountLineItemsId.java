package io.commercelayer.api.operation;

import io.commercelayer.api.model.LineItem;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountLineItemsId
 */
public class DeleteAccountLineItemsId extends DeleteOperation<LineItem> {

	public static final String OPERATION_PATH = "/account/line_items/{id}";


	public DeleteAccountLineItemsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountLineItemsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<LineItem> getResourceType() {
		return LineItem.class;
	}
	
}
