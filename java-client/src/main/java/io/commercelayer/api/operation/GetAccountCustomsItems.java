package io.commercelayer.api.operation;

import io.commercelayer.api.model.CustomsItem;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountCustomsItems
 */
public class GetAccountCustomsItems extends SearchOperation<CustomsItem> {

	public static final String OPERATION_PATH = "/account/customs_items";


	public GetAccountCustomsItems() {
		super(OPERATION_PATH);
	}
	

	public Class<CustomsItem> getResourceType() {
		return CustomsItem.class;
	}
	
}
