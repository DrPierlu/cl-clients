package io.commercelayer.api.operation;

import io.commercelayer.api.model.MetaField;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountMetaFields
 */
public class GetAccountMetaFields extends SearchOperation<MetaField> {

	public static final String OPERATION_PATH = "/account/meta_fields";


	public GetAccountMetaFields() {
		super(OPERATION_PATH);
	}
	

	public Class<MetaField> getResourceType() {
		return MetaField.class;
	}
	
}
