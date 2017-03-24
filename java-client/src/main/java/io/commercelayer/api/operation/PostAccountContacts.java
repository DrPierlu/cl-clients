package io.commercelayer.api.operation;

import io.commercelayer.api.model.Contact;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountContacts
 */
public class PostAccountContacts extends PostOperation<Contact> {

	public static final String OPERATION_PATH = "/account/contacts";


	{
		addRequiredField("name");
		addRequiredField("email");
		addRequiredField("phone");
		addRequiredField("nationalIdNumber");
		addRequiredField("taxIdNumber");
		addRequiredField("custom1");
		addRequiredField("custom2");
		addRequiredField("custom3");
	}


	public PostAccountContacts() {
		super(OPERATION_PATH);
	}
	

	public Class<Contact> getResourceType() {
		return Contact.class;
	}
	
}
