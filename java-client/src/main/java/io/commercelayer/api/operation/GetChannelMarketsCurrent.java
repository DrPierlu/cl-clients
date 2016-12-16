package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetChannelMarketsCurrent
 */
public class GetChannelMarketsCurrent extends SearchOperation {

	public static final String OPERATION_PATH = "/channel/markets/current";


	public GetChannelMarketsCurrent() {
		super(OPERATION_PATH);
	}
	
}
