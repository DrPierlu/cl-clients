package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountChannelsId
 */
public class DeleteAccountChannelsId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/channels/{id}";


	public DeleteAccountChannelsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountChannelsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
