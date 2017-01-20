package io.commercelayer.api.operation;

import io.commercelayer.api.model.Channel;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountChannels
 */
public class PostAccountChannels extends PostOperation<Channel> {

	public static final String OPERATION_PATH = "/account/channels";


	{
		addRequiredField("name");
	}


	public PostAccountChannels() {
		super(OPERATION_PATH);
	}
	

	public Class<Channel> getResourceType() {
		return Channel.class;
	}
	
}
