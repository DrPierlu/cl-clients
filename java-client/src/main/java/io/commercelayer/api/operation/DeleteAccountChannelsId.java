package io.commercelayer.api.operation;

import io.commercelayer.api.model.Channel;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountChannelsId
 */
public class DeleteAccountChannelsId extends DeleteOperation<Channel> {

	public static final String OPERATION_PATH = "/account/channels/{id}";


	public DeleteAccountChannelsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountChannelsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Channel> getResourceType() {
		return Channel.class;
	}
	
}
