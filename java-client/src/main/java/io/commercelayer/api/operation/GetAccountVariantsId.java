package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountVariantsId
 */
public class GetAccountVariantsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/variants/{id}";


	public GetAccountVariantsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountVariantsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
