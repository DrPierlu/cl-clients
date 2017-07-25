package io.commercelayer.api.operation;

import io.commercelayer.api.model.LineItem;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountLineItemsId
 */
public class PutAccountLineItemsId extends PutOperation<LineItem> {

	public static final String OPERATION_PATH = "/account/line_items/{id}";


	{
		addRequiredField("orderId");
		addRequiredField("sellableResource");
		addRequiredField("sellableId");
		addRequiredField("quantity");
		addRequiredField("stockItemIds");
		addRequiredField("shippingServiceStockLocationIds");
		addRequiredField("resourceMetaFieldIds");
		addRequiredField("metaFieldIds");
		addRequiredField("shippingMethodIds");
		addRequiredField("shipmentIds");
	}


	public PutAccountLineItemsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountLineItemsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<LineItem> getResourceType() {
		return LineItem.class;
	}
	
}
