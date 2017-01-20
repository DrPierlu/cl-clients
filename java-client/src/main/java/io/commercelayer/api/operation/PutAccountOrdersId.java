package io.commercelayer.api.operation;

import io.commercelayer.api.model.Order;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountOrdersId
 */
public class PutAccountOrdersId extends PutOperation {

	public static final String OPERATION_PATH = "/account/orders/{id}";


	{
		addRequiredField("channelId");
		addRequiredField("countryId");
		addRequiredField("customerId");
		addRequiredField("id");
	}


	public PutAccountOrdersId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountOrdersId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Order.class;
	}
	
}
