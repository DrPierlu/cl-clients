package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountCatalogs
 */
public class GetAccountCatalogs extends SearchOperation {

	public static final String OPERATION_PATH = "/account/catalogs";


	public GetAccountCatalogs() {
		super(OPERATION_PATH);
	}
	
}
