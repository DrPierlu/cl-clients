package io.commercelayer.api.operation;

import io.commercelayer.api.model.ResourceContentField;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountResourceContentFields
 */
public class GetAccountResourceContentFields extends SearchOperation<ResourceContentField> {

	public static final String OPERATION_PATH = "/account/resource_content_fields";


	public GetAccountResourceContentFields() {
		super(OPERATION_PATH);
	}
	

	public Class<ResourceContentField> getResourceType() {
		return ResourceContentField.class;
	}
	
}
