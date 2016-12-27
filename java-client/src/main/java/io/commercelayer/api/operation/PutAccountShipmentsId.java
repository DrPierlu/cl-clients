package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountShipmentsId
 */
public class PutAccountShipmentsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/shipments/{id}";


	{
		addRequiredField("id");
	}


	public PutAccountShipmentsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShipmentsId(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
