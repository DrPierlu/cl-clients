package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;

/**
 * GetAllTaxCategories
 */
public class GetAllTaxCategories extends SearchOperation {

	public static final String OPERATION_PATH = "/all/tax_categories";


	public GetAllTaxCategories() {
		super(OPERATION_PATH);
	}
	
}
