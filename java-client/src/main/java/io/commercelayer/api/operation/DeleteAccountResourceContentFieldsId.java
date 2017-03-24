package io.commercelayer.api.operation;

import io.commercelayer.api.model.ResourceContentField;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountResourceContentFieldsId
 */
public class DeleteAccountResourceContentFieldsId extends DeleteOperation<ResourceContentField> {

	public static final String OPERATION_PATH = "/account/resource_content_fields/{id}";


	public DeleteAccountResourceContentFieldsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountResourceContentFieldsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ResourceContentField> getResourceType() {
		return ResourceContentField.class;
	}
	
}
