package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetChannelProducts
 */
public class GetChannelProducts extends SearchOperation {

	public static final String OPERATION_PATH = "/channel/products";


	public GetChannelProducts() {
		super(OPERATION_PATH);
	}
	
}
