package io.commercelayer.api.operation;

import io.commercelayer.api.model.CustomsItem;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountCustomsItemsId
 */
public class PutAccountCustomsItemsId extends PutOperation<CustomsItem> {

	public static final String OPERATION_PATH = "/account/customs_items/{id}";


	{
		addRequiredField("customsFormId");
		addRequiredField("lineItemStockId");
	}


	public PutAccountCustomsItemsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountCustomsItemsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<CustomsItem> getResourceType() {
		return CustomsItem.class;
	}
	
}
