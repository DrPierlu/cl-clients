package io.commercelayer.api.operation;

import io.commercelayer.api.model.ContentField;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountContentFieldsId
 */
public class GetAccountContentFieldsId extends GetIdOperation<ContentField> {

	public static final String OPERATION_PATH = "/account/content_fields/{id}";


	public GetAccountContentFieldsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountContentFieldsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ContentField> getResourceType() {
		return ContentField.class;
	}
	
}
