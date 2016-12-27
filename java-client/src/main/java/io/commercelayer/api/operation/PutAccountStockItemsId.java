package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountStockItemsId
 */
public class PutAccountStockItemsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/stock_items/{id}";


	{
		addRequiredField("stockLocationId");
		addRequiredField("stockableResource");
		addRequiredField("stockableId");
		addRequiredField("quantity");
		addRequiredField("id");
	}

	public PutAccountStockItemsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountStockItemsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
