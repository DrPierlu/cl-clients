package io.commercelayer.api.operation;

import io.commercelayer.api.model.Webhook;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountWebhooksId
 */
public class DeleteAccountWebhooksId extends DeleteOperation<Webhook> {

	public static final String OPERATION_PATH = "/account/webhooks/{id}";


	public DeleteAccountWebhooksId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountWebhooksId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Webhook> getResourceType() {
		return Webhook.class;
	}
	
}
