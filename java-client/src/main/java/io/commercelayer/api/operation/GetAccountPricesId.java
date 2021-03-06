package io.commercelayer.api.operation;

import io.commercelayer.api.model.Price;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountPricesId
 */
public class GetAccountPricesId extends GetIdOperation<Price> {

	public static final String OPERATION_PATH = "/account/prices/{id}";


	public GetAccountPricesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountPricesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Price> getResourceType() {
		return Price.class;
	}
	
}
