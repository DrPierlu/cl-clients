package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostChannelProducts
 */
public class PostChannelProducts extends PostOperation {

	public static final String OPERATION_PATH = "/channel/products";


	public PostChannelProducts() {
		super(OPERATION_PATH);
	}
	
}
