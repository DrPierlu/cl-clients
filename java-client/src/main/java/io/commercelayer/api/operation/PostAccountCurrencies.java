package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountCurrencies
 */
public class PostAccountCurrencies extends PostOperation {

	public static final String OPERATION_PATH = "/account/currencies";


	public PostAccountCurrencies() {
		super(OPERATION_PATH);
	}
	
}
