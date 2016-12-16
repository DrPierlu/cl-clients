package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountMerchantsId
 */
public class PutAccountMerchantsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/merchants/{id}";


	public PutAccountMerchantsId() {
		super(OPERATION_PATH);
	}
	
}
