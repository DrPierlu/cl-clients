package io.commercelayer.api.operation;

import io.commercelayer.api.model.ResourceMetaField;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountResourceMetaFieldsId
 */
public class PutAccountResourceMetaFieldsId extends PutOperation<ResourceMetaField> {

	public static final String OPERATION_PATH = "/account/resource_meta_fields/{id}";


	{
		addRequiredField("extensibleResource");
		addRequiredField("extensibleId");
		addRequiredField("metaFieldId");
	}


	public PutAccountResourceMetaFieldsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountResourceMetaFieldsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ResourceMetaField> getResourceType() {
		return ResourceMetaField.class;
	}
	
}
