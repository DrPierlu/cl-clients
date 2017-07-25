package io.commercelayer.api.operation;

import io.commercelayer.api.model.ContentField;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountContentFieldsId
 */
public class PutAccountContentFieldsId extends PutOperation<ContentField> {

	public static final String OPERATION_PATH = "/account/content_fields/{id}";


	{
		addRequiredField("namespace");
		addRequiredField("name");
		addRequiredField("content");
	}


	public PutAccountContentFieldsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountContentFieldsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ContentField> getResourceType() {
		return ContentField.class;
	}
	
}
