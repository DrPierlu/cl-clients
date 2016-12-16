package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAccountMerchandisingRules
 */
public class GetAccountMerchandisingRules extends SearchOperation {

	public static final String OPERATION_PATH = "/account/merchandising_rules";


	public GetAccountMerchandisingRules() {
		super(OPERATION_PATH);
	}
	
}
