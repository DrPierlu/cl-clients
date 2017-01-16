package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountStockLocationsId
 */
public class GetAccountStockLocationsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/stock_locations/{id}";


	public GetAccountStockLocationsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountStockLocationsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
