package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountChannelsId
 */
public class PutAccountChannelsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/channels/{id}";


	public PutAccountChannelsId() {
		super(OPERATION_PATH);
	}
	
}
