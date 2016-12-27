package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountChannelsId
 */
public class PutAccountChannelsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/channels/{id}";


	{
		addRequiredField("name");
		addRequiredField("id");
	}

	public PutAccountChannelsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountChannelsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
