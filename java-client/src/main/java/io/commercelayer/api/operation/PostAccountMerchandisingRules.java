package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountMerchandisingRules
 */
public class PostAccountMerchandisingRules extends PostOperation {

	public static final String OPERATION_PATH = "/account/merchandising_rules";


	public PostAccountMerchandisingRules() {
		super(OPERATION_PATH);
	}
	
}
