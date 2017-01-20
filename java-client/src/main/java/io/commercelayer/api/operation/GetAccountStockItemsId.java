package io.commercelayer.api.operation;

import io.commercelayer.api.model.StockItem;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountStockItemsId
 */
public class GetAccountStockItemsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/stock_items/{id}";


	public GetAccountStockItemsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountStockItemsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return StockItem.class;
	}
	
}
