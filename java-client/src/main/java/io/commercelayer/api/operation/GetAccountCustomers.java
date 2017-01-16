package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountCustomers
 */
public class GetAccountCustomers extends SearchOperation {

	public static final String OPERATION_PATH = "/account/customers";


	public GetAccountCustomers() {
		super(OPERATION_PATH);
	}
	
}
