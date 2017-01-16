package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountVariants
 */
public class GetAccountVariants extends SearchOperation {

	public static final String OPERATION_PATH = "/account/variants";


	public GetAccountVariants() {
		super(OPERATION_PATH);
	}
	
}
