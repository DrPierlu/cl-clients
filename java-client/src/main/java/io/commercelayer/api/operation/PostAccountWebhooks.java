package io.commercelayer.api.operation;

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
	
}
