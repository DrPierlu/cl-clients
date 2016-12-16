package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAccountTaxons
 */
public class GetAccountTaxons extends SearchOperation {

	public static final String OPERATION_PATH = "/account/taxons";


	public GetAccountTaxons() {
		super(OPERATION_PATH);
	}
	
}
