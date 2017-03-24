package io.commercelayer.api.operation;

import io.commercelayer.api.model.Contact;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountContactsId
 */
public class GetAccountContactsId extends GetIdOperation<Contact> {

	public static final String OPERATION_PATH = "/account/contacts/{id}";


	public GetAccountContactsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountContactsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Contact> getResourceType() {
		return Contact.class;
	}
	
}
