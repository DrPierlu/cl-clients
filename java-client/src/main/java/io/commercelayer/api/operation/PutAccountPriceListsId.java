package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountPriceListsId
 */
public class PutAccountPriceListsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/price_lists/{id}";


	{
		addRequiredField("currencyId");
		addRequiredField("name");
		addRequiredField("taxIncluded");
		addRequiredField("id");
	}

	public PutAccountPriceListsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountPriceListsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
