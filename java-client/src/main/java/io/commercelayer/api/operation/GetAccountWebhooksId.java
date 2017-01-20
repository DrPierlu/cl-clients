package io.commercelayer.api.operation;

import io.commercelayer.api.model.Webhook;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountWebhooksId
 */
public class GetAccountWebhooksId extends GetIdOperation<Webhook> {

	public static final String OPERATION_PATH = "/account/webhooks/{id}";


	public GetAccountWebhooksId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountWebhooksId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Webhook> getResourceType() {
		return Webhook.class;
	}
	
}
