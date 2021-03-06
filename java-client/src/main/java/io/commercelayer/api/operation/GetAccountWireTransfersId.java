package io.commercelayer.api.operation;

import io.commercelayer.api.model.WireTransfer;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountWireTransfersId
 */
public class GetAccountWireTransfersId extends GetIdOperation<WireTransfer> {

	public static final String OPERATION_PATH = "/account/wire_transfers/{id}";


	public GetAccountWireTransfersId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountWireTransfersId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<WireTransfer> getResourceType() {
		return WireTransfer.class;
	}
	
}
