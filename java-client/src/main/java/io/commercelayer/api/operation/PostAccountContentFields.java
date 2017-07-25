package io.commercelayer.api.operation;

import io.commercelayer.api.model.ContentField;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountContentFields
 */
public class PostAccountContentFields extends PostOperation<ContentField> {

	public static final String OPERATION_PATH = "/account/content_fields";


	{
		addRequiredField("namespace");
		addRequiredField("name");
		addRequiredField("content");
	}


	public PostAccountContentFields() {
		super(OPERATION_PATH);
	}
	

	public Class<ContentField> getResourceType() {
		return ContentField.class;
	}
	
}
