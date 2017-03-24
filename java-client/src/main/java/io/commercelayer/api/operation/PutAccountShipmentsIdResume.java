package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountShipmentsIdResume
 */
public class PutAccountShipmentsIdResume extends PutOperation {

	public static final String OPERATION_PATH = "/account/shipments/{id}/resume";


	{
		
	}


	public PutAccountShipmentsIdResume() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShipmentsIdResume(Long id) {
		super(OPERATION_PATH, id);
	}
	
}
