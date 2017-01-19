package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountWireTransfers
 */
public class GetAccountWireTransfers extends SearchOperation {

	public static final String OPERATION_PATH = "/account/wire_transfers";


	public GetAccountWireTransfers() {
		super(OPERATION_PATH);
	}
	
}
