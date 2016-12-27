package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountStockLocationsId
 */
public class PutAccountStockLocationsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/stock_locations/{id}";


	{
		addRequiredField("name");
		addRequiredField("parentId");
		addRequiredField("id");
	}

	public PutAccountStockLocationsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountStockLocationsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
