package io.commercelayer.api.operation;

import io.commercelayer.api.model.ResourceContentField;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountResourceContentFields
 */
public class PostAccountResourceContentFields extends PostOperation<ResourceContentField> {

	public static final String OPERATION_PATH = "/account/resource_content_fields";


	{
		addRequiredField("extensibleResource");
		addRequiredField("extensibleId");
		addRequiredField("contentFieldId");
	}


	public PostAccountResourceContentFields() {
		super(OPERATION_PATH);
	}
	

	public Class<ResourceContentField> getResourceType() {
		return ResourceContentField.class;
	}
	
}
