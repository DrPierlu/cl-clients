package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetChannelAggregations
 */
public class GetChannelAggregations extends SearchOperation {

	public static final String OPERATION_PATH = "/channel/aggregations";


	public GetChannelAggregations() {
		super(OPERATION_PATH);
	}
	
}
