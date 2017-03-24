package io.commercelayer.api.operation;

import io.commercelayer.api.model.ContentField;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountContentFields
 */
public class GetAccountContentFields extends SearchOperation<ContentField> {

	public static final String OPERATION_PATH = "/account/content_fields";


	public GetAccountContentFields() {
		super(OPERATION_PATH);
	}
	

	public Class<ContentField> getResourceType() {
		return ContentField.class;
	}
	
}
