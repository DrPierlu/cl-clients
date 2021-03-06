package io.commercelayer.api.operation;

import io.commercelayer.api.model.WireTransfer;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountWireTransfersId
 */
public class DeleteAccountWireTransfersId extends DeleteOperation<WireTransfer> {

	public static final String OPERATION_PATH = "/account/wire_transfers/{id}";


	public DeleteAccountWireTransfersId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountWireTransfersId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<WireTransfer> getResourceType() {
		return WireTransfer.class;
	}
	
}
