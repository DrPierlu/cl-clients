package io.commercelayer.api.operation;

import io.commercelayer.api.model.PriceList;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountPriceListsId
 */
public class GetAccountPriceListsId extends GetIdOperation<PriceList> {

	public static final String OPERATION_PATH = "/account/price_lists/{id}";


	public GetAccountPriceListsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountPriceListsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<PriceList> getResourceType() {
		return PriceList.class;
	}
	
}
