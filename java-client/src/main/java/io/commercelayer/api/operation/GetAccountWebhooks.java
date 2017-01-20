package io.commercelayer.api.operation;

import io.commercelayer.api.model.Webhook;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountWebhooks
 */
public class GetAccountWebhooks extends SearchOperation<Webhook> {

	public static final String OPERATION_PATH = "/account/webhooks";


	public GetAccountWebhooks() {
		super(OPERATION_PATH);
	}
	

	public Class<Webhook> getResourceType() {
		return Webhook.class;
	}
	
}
