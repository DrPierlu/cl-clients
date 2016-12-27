package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountWebhooksId
 */
public class PutAccountWebhooksId extends PutOperation {

	public static final String OPERATION_PATH = "/account/webhooks/{id}";


	{
		addRequiredField("eventSubject");
		addRequiredField("eventAction");
		addRequiredField("eventUrl");
		addRequiredField("id");
	}

	public PutAccountWebhooksId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountWebhooksId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
