package io.commercelayer.api.operation;

import io.commercelayer.api.model.MetaField;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountMetaFieldsId
 */
public class PutAccountMetaFieldsId extends PutOperation<MetaField> {

	public static final String OPERATION_PATH = "/account/meta_fields/{id}";


	{
		addRequiredField("namespace");
		addRequiredField("key");
		addRequiredField("value");
	}


	public PutAccountMetaFieldsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountMetaFieldsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<MetaField> getResourceType() {
		return MetaField.class;
	}
	
}
