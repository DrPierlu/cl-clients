package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountProducts
 */
public class GetAccountProducts extends SearchOperation {

	public static final String OPERATION_PATH = "/account/products";


	public GetAccountProducts() {
		super(OPERATION_PATH);
	}
	
}
