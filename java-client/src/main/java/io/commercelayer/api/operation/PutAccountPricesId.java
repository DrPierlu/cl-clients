package io.commercelayer.api.operation;

import io.commercelayer.api.model.Price;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountPricesId
 */
public class PutAccountPricesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/prices/{id}";


	{
		addRequiredField("priceListId");
		addRequiredField("amount");
		addRequiredField("sellableResource");
		addRequiredField("sellableId");
		addRequiredField("id");
	}


	public PutAccountPricesId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountPricesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Price.class;
	}
	
}
