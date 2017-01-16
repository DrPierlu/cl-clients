package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountTaxonomies
 */
public class GetAccountTaxonomies extends SearchOperation {

	public static final String OPERATION_PATH = "/account/taxonomies";


	public GetAccountTaxonomies() {
		super(OPERATION_PATH);
	}
	
}
