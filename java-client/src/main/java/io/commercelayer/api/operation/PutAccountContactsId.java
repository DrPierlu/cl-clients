package io.commercelayer.api.operation;

import io.commercelayer.api.model.Contact;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountContactsId
 */
public class PutAccountContactsId extends PutOperation<Contact> {

	public static final String OPERATION_PATH = "/account/contacts/{id}";


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


	public PutAccountContactsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountContactsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Contact> getResourceType() {
		return Contact.class;
	}
	
}
