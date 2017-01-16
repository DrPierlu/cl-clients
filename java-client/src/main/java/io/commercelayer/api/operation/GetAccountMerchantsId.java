package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountMerchantsId
 */
public class GetAccountMerchantsId extends GetIdOperation {

	public static final String OPERATION_PATH = "/account/merchants/{id}";


	public GetAccountMerchantsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountMerchantsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
