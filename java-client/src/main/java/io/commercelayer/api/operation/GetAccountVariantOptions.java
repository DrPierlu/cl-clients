package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountVariantOptions
 */
public class GetAccountVariantOptions extends SearchOperation {

	public static final String OPERATION_PATH = "/account/variant_options";


	public GetAccountVariantOptions() {
		super(OPERATION_PATH);
	}
	
}
