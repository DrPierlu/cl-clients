package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountOptionValuesId
 */
public class GetAccountOptionValuesId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/option_values/{id}";


	public GetAccountOptionValuesId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountOptionValuesId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
