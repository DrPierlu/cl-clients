package io.commercelayer.api.operation;

import io.commercelayer.api.model.LineItemStock;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountLineItemStocksId
 */
public class DeleteAccountLineItemStocksId extends DeleteOperation<LineItemStock> {

	public static final String OPERATION_PATH = "/account/line_item_stocks/{id}";


	public DeleteAccountLineItemStocksId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountLineItemStocksId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<LineItemStock> getResourceType() {
		return LineItemStock.class;
	}
	
}
