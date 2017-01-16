package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountAddresses
 */
public class GetAccountAddresses extends SearchOperation {

	public static final String OPERATION_PATH = "/account/addresses";


	public GetAccountAddresses() {
		super(OPERATION_PATH);
	}
	
}
