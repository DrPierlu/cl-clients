package io.commercelayer.api.operation;

import io.commercelayer.api.model.CustomsItem;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountCustomsItemsId
 */
public class GetAccountCustomsItemsId extends GetIdOperation<CustomsItem> {

	public static final String OPERATION_PATH = "/account/customs_items/{id}";


	public GetAccountCustomsItemsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountCustomsItemsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<CustomsItem> getResourceType() {
		return CustomsItem.class;
	}
	
}
