package io.commercelayer.api.operation;

import io.commercelayer.api.model.ResourceMetaField;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountResourceMetaFieldsId
 */
public class DeleteAccountResourceMetaFieldsId extends DeleteOperation<ResourceMetaField> {

	public static final String OPERATION_PATH = "/account/resource_meta_fields/{id}";


	public DeleteAccountResourceMetaFieldsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountResourceMetaFieldsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ResourceMetaField> getResourceType() {
		return ResourceMetaField.class;
	}
	
}
