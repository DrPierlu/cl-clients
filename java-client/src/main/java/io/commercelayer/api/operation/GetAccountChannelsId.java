package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;

/**
 * GetAccountChannelsId
 */
public class GetAccountChannelsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/channels/{id}";


	public GetAccountChannelsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountChannelsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
