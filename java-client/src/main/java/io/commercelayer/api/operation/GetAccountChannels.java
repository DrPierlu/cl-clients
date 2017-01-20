package io.commercelayer.api.operation;

import io.commercelayer.api.model.Channel;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountChannels
 */
public class GetAccountChannels extends SearchOperation<Channel> {

	public static final String OPERATION_PATH = "/account/channels";


	public GetAccountChannels() {
		super(OPERATION_PATH);
	}
	

	public Class<Channel> getResourceType() {
		return Channel.class;
	}
	
}
