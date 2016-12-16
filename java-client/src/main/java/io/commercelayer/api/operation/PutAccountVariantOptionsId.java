package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountVariantOptionsId
 */
public class PutAccountVariantOptionsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/variant_options/{id}";


	public PutAccountVariantOptionsId() {
		super(OPERATION_PATH);
	}
	
}
