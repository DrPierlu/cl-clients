package io.commercelayer.api.operation;

import io.commercelayer.api.model.Channel;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetChannel
 */
public class GetChannel extends SearchOperation<Channel> {

	public static final String OPERATION_PATH = "/channel";


	public GetChannel() {
		super(OPERATION_PATH);
	}
	

	public Class<Channel> getResourceType() {
		return Channel.class;
	}
	
}
