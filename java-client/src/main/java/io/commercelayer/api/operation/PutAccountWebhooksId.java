package io.commercelayer.api.operation;

import io.commercelayer.api.model.Webhook;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountWebhooksId
 */
public class PutAccountWebhooksId extends PutOperation<Webhook> {

	public static final String OPERATION_PATH = "/account/webhooks/{id}";


	{
		addRequiredField("eventKind");
		addRequiredField("eventUrl");
	}


	public PutAccountWebhooksId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountWebhooksId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Webhook> getResourceType() {
		return Webhook.class;
	}
	
}
