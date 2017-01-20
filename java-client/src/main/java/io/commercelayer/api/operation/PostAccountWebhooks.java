package io.commercelayer.api.operation;

import io.commercelayer.api.model.Webhook;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountWebhooks
 */
public class PostAccountWebhooks extends PostOperation<Webhook> {

	public static final String OPERATION_PATH = "/account/webhooks";


	{
		addRequiredField("eventSubject");
		addRequiredField("eventAction");
		addRequiredField("eventUrl");
	}


	public PostAccountWebhooks() {
		super(OPERATION_PATH);
	}
	

	public Class<Webhook> getResourceType() {
		return Webhook.class;
	}
	
}
