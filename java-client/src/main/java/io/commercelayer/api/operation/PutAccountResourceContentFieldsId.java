package io.commercelayer.api.operation;

import io.commercelayer.api.model.ResourceContentField;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountResourceContentFieldsId
 */
public class PutAccountResourceContentFieldsId extends PutOperation<ResourceContentField> {

	public static final String OPERATION_PATH = "/account/resource_content_fields/{id}";


	{
		addRequiredField("extensibleResource");
		addRequiredField("extensibleId");
		addRequiredField("contentFieldId");
	}


	public PutAccountResourceContentFieldsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountResourceContentFieldsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ResourceContentField> getResourceType() {
		return ResourceContentField.class;
	}
	
}
