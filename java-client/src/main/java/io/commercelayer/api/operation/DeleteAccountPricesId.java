package io.commercelayer.api.operation;

import io.commercelayer.api.model.Price;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountPricesId
 */
public class DeleteAccountPricesId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/prices/{id}";


	public DeleteAccountPricesId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountPricesId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Price.class;
	}
	
}
