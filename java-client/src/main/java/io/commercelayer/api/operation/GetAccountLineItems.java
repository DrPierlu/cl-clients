package io.commercelayer.api.operation;

import io.commercelayer.api.model.LineItem;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountLineItems
 */
public class GetAccountLineItems extends SearchOperation {

	public static final String OPERATION_PATH = "/account/line_items";


	public GetAccountLineItems() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return LineItem.class;
	}
	
}
