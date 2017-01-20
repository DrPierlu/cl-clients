package io.commercelayer.api.operation;

import io.commercelayer.api.model.WireTransfer;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountWireTransfers
 */
public class PostAccountWireTransfers extends PostOperation<WireTransfer> {

	public static final String OPERATION_PATH = "/account/wire_transfers";


	public PostAccountWireTransfers() {
		super(OPERATION_PATH);
	}
	

	public Class<WireTransfer> getResourceType() {
		return WireTransfer.class;
	}
	
}
