package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountPriceListsId
 */
public class PutAccountPriceListsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/price_lists/{id}";


	public PutAccountPriceListsId() {
		super(OPERATION_PATH);
	}
	
}
