package io.commercelayer.api.operation;

import io.commercelayer.api.model.ContentField;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountContentFieldsId
 */
public class DeleteAccountContentFieldsId extends DeleteOperation<ContentField> {

	public static final String OPERATION_PATH = "/account/content_fields/{id}";


	public DeleteAccountContentFieldsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountContentFieldsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ContentField> getResourceType() {
		return ContentField.class;
	}
	
}
