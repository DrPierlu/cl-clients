package io.commercelayer.api.operation;

import io.commercelayer.api.model.Contact;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountContactsId
 */
public class DeleteAccountContactsId extends DeleteOperation<Contact> {

	public static final String OPERATION_PATH = "/account/contacts/{id}";


	public DeleteAccountContactsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountContactsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<Contact> getResourceType() {
		return Contact.class;
	}
	
}
