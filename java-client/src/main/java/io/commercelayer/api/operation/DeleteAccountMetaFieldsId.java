package io.commercelayer.api.operation;

import io.commercelayer.api.model.MetaField;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountMetaFieldsId
 */
public class DeleteAccountMetaFieldsId extends DeleteOperation<MetaField> {

	public static final String OPERATION_PATH = "/account/meta_fields/{id}";


	public DeleteAccountMetaFieldsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountMetaFieldsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<MetaField> getResourceType() {
		return MetaField.class;
	}
	
}
