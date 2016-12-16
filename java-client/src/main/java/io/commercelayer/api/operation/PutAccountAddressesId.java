package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountAddressesId
 */
public class PutAccountAddressesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/addresses/{id}";


	public PutAccountAddressesId() {
		super(OPERATION_PATH);
	}
	
}
