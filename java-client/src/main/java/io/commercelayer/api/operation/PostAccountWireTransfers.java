package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountWireTransfers
 */
public class PostAccountWireTransfers extends PostOperation {

	public static final String OPERATION_PATH = "/account/wire_transfers";


	public PostAccountWireTransfers() {
		super(OPERATION_PATH);
	}
	
}
