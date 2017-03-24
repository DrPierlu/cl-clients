package io.commercelayer.api.operation;

import io.commercelayer.api.model.ResourceMetaField;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountResourceMetaFields
 */
public class GetAccountResourceMetaFields extends SearchOperation<ResourceMetaField> {

	public static final String OPERATION_PATH = "/account/resource_meta_fields";


	public GetAccountResourceMetaFields() {
		super(OPERATION_PATH);
	}
	

	public Class<ResourceMetaField> getResourceType() {
		return ResourceMetaField.class;
	}
	
}
