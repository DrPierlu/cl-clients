package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountTaxonsId
 */
public class PutAccountTaxonsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/taxons/{id}";


	public PutAccountTaxonsId() {
		super(OPERATION_PATH);
	}
	
}
