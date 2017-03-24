package io.commercelayer.api.operation;

import io.commercelayer.api.model.ResourceContentField;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountResourceContentFieldsId
 */
public class GetAccountResourceContentFieldsId extends GetIdOperation<ResourceContentField> {

	public static final String OPERATION_PATH = "/account/resource_content_fields/{id}";


	public GetAccountResourceContentFieldsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountResourceContentFieldsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ResourceContentField> getResourceType() {
		return ResourceContentField.class;
	}
	
}
