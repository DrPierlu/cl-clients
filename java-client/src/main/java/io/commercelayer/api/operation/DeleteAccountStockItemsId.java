package io.commercelayer.api.operation;

import io.commercelayer.api.model.StockItem;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountStockItemsId
 */
public class DeleteAccountStockItemsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/stock_items/{id}";


	public DeleteAccountStockItemsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountStockItemsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return StockItem.class;
	}
	
}
