package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountWebhooks
 */
public class GetAccountWebhooks extends SearchOperation {

	public static final String OPERATION_PATH = "/account/webhooks";


	public GetAccountWebhooks() {
		super(OPERATION_PATH);
	}
	
}
