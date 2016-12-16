package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAccountChannels
 */
public class GetAccountChannels extends SearchOperation {

	public static final String OPERATION_PATH = "/account/channels";


	public GetAccountChannels() {
		super(OPERATION_PATH);
	}
	
}
