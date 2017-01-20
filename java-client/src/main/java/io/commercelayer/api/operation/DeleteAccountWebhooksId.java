package io.commercelayer.api.operation;

import io.commercelayer.api.model.Webhook;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountWebhooksId
 */
public class DeleteAccountWebhooksId extends DeleteOperation {

	public static final String OPERATION_PATH = "/account/webhooks/{id}";


	public DeleteAccountWebhooksId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountWebhooksId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Webhook.class;
	}
	
}
