package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountCatalogsId
 */
public class PutAccountCatalogsId extends PutOperation {

	public static final String OPERATION_PATH = "/account/catalogs/{id}";


	public PutAccountCatalogsId() {
		super(OPERATION_PATH);
	}
	
}
