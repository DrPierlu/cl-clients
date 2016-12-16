package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountWebhooks
 */
public class PostAccountWebhooks extends PostOperation {

	public static final String OPERATION_PATH = "/account/webhooks";


	public PostAccountWebhooks() {
		super(OPERATION_PATH);
	}
	
}
