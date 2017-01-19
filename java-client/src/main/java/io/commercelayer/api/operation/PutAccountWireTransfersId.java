package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountWireTransfersId
 */
public class PutAccountWireTransfersId extends PutOperation {

	public static final String OPERATION_PATH = "/account/wire_transfers/{id}";


	{
		addRequiredField("id");
	}


	public PutAccountWireTransfersId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountWireTransfersId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
