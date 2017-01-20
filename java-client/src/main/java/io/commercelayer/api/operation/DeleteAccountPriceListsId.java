package io.commercelayer.api.operation;

import io.commercelayer.api.model.PriceList;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountPriceListsId
 */
public class DeleteAccountPriceListsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/price_lists/{id}";


	public DeleteAccountPriceListsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountPriceListsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return PriceList.class;
	}
	
}
