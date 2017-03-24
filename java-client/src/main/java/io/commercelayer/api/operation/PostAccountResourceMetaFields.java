package io.commercelayer.api.operation;

import io.commercelayer.api.model.ResourceMetaField;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountResourceMetaFields
 */
public class PostAccountResourceMetaFields extends PostOperation<ResourceMetaField> {

	public static final String OPERATION_PATH = "/account/resource_meta_fields";


	{
		addRequiredField("extensibleResource");
		addRequiredField("extensibleId");
		addRequiredField("metaFieldId");
	}


	public PostAccountResourceMetaFields() {
		super(OPERATION_PATH);
	}
	

	public Class<ResourceMetaField> getResourceType() {
		return ResourceMetaField.class;
	}
	
}
