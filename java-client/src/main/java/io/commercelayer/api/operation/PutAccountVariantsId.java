package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountVariantsId
 */
public class PutAccountVariantsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/variants/{id}";


	public PutAccountVariantsId() {
		super(OPERATION_PATH);
	}
	
}
