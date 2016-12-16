package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountChannels
 */
public class PostAccountChannels extends PostOperation {

	public static final String OPERATION_PATH = "/account/channels";


	public PostAccountChannels() {
		super(OPERATION_PATH);
	}
	
}
