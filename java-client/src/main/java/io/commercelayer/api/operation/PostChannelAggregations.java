package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostChannelAggregations
 */
public class PostChannelAggregations extends PostOperation {

	public static final String OPERATION_PATH = "/channel/aggregations";


	public PostChannelAggregations() {
		super(OPERATION_PATH);
	}
	
}
