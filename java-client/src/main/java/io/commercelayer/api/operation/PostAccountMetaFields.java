package io.commercelayer.api.operation;

import io.commercelayer.api.model.MetaField;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountMetaFields
 */
public class PostAccountMetaFields extends PostOperation<MetaField> {

	public static final String OPERATION_PATH = "/account/meta_fields";


	{
		addRequiredField("namespace");
		addRequiredField("name");
		addRequiredField("value");
	}


	public PostAccountMetaFields() {
		super(OPERATION_PATH);
	}
	

	public Class<MetaField> getResourceType() {
		return MetaField.class;
	}
	
}
