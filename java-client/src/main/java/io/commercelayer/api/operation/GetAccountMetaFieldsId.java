package io.commercelayer.api.operation;

import io.commercelayer.api.model.MetaField;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountMetaFieldsId
 */
public class GetAccountMetaFieldsId extends GetIdOperation<MetaField> {

	public static final String OPERATION_PATH = "/account/meta_fields/{id}";


	public GetAccountMetaFieldsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountMetaFieldsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<MetaField> getResourceType() {
		return MetaField.class;
	}
	
}
