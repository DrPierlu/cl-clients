package io.commercelayer.api.operation;

import io.commercelayer.api.model.Contact;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountContacts
 */
public class GetAccountContacts extends SearchOperation<Contact> {

	public static final String OPERATION_PATH = "/account/contacts";


	public GetAccountContacts() {
		super(OPERATION_PATH);
	}
	

	public Class<Contact> getResourceType() {
		return Contact.class;
	}
	
}
