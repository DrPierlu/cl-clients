package io.commercelayer.api.operation;

import io.commercelayer.api.model.StockLocation;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountStockLocationsId
 */
public class PutAccountStockLocationsId extends PutOperation<StockLocation> {

	public static final String OPERATION_PATH = "/account/stock_locations/{id}";


	{
		addRequiredField("name");
		addRequiredField("addressId");
	}


	public PutAccountStockLocationsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountStockLocationsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<StockLocation> getResourceType() {
		return StockLocation.class;
	}
	
}
