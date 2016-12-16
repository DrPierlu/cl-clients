package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountPricesId
 */
public class PutAccountPricesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/prices/{id}";


	public PutAccountPricesId() {
		super(OPERATION_PATH);
	}
	
}
