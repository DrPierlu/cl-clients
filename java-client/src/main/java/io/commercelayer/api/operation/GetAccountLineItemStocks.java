package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountLineItemStocks
 */
public class GetAccountLineItemStocks extends SearchOperation {

	public static final String OPERATION_PATH = "/account/line_item_stocks";


	public GetAccountLineItemStocks() {
		super(OPERATION_PATH);
	}
	
}
