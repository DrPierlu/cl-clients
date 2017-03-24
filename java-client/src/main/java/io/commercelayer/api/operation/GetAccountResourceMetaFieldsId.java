package io.commercelayer.api.operation;

import io.commercelayer.api.model.ResourceMetaField;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountResourceMetaFieldsId
 */
public class GetAccountResourceMetaFieldsId extends GetIdOperation<ResourceMetaField> {

	public static final String OPERATION_PATH = "/account/resource_meta_fields/{id}";


	public GetAccountResourceMetaFieldsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountResourceMetaFieldsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ResourceMetaField> getResourceType() {
		return ResourceMetaField.class;
	}
	
}
