package io.commercelayer.api.operation;

import io.commercelayer.api.model.Webhook;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountWebhooks
 */
public class PostAccountWebhooks extends PostOperation {

	public static final String OPERATION_PATH = "/account/webhooks";


	{
		addRequiredField("eventSubject");
		addRequiredField("eventAction");
		addRequiredField("eventUrl");
	}


	public PostAccountWebhooks() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Webhook.class;
	}
	
}
