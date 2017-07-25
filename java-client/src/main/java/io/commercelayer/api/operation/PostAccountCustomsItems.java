package io.commercelayer.api.operation;

import io.commercelayer.api.model.CustomsItem;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountCustomsItems
 */
public class PostAccountCustomsItems extends PostOperation<CustomsItem> {

	public static final String OPERATION_PATH = "/account/customs_items";


	{
		addRequiredField("customsFormId");
		addRequiredField("lineItemStockId");
	}


	public PostAccountCustomsItems() {
		super(OPERATION_PATH);
	}
	

	public Class<CustomsItem> getResourceType() {
		return CustomsItem.class;
	}
	
}
