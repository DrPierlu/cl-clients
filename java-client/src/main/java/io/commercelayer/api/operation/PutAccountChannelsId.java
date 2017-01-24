package io.commercelayer.api.operation;

import io.commercelayer.api.model.Channel;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountChannelsId
 */
public class PutAccountChannelsId extends PutOperation<Channel> {

	public static final String OPERATION_PATH = "/account/channels/{id}";


	{
		addRequiredField("name");
	}


	public PutAccountChannelsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountChannelsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Channel> getResourceType() {
		return Channel.class;
	}
	
}
