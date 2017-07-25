package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetPublicTaxCategories
 */
public class GetPublicTaxCategories extends SearchOperation {

	public static final String OPERATION_PATH = "/public/tax_categories";


	public GetPublicTaxCategories() {
		super(OPERATION_PATH);
	}
	
}
