package io.commercelayer.api.operation;

import io.commercelayer.api.model.LineItem;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutChannelLineItemsId
 */
public class PutChannelLineItemsId extends PutOperation {

	public static final String OPERATION_PATH = "/channel/line_items/{id}";


	{
		addRequiredField("sellableResource");
		addRequiredField("sellableId");
		addRequiredField("quantity");
		addRequiredField("id");
	}


	public PutChannelLineItemsId() {
		super(OPERATION_PATH);
	}
	

	public PutChannelLineItemsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return LineItem.class;
	}
	
}
