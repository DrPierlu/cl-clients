package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PutOperation;

/**
 * PutAccountTaxonomiesId
 */
public class PutAccountTaxonomiesId extends PutOperation {

	public static final String OPERATION_PATH = "/account/taxonomies/{id}";


	public PutAccountTaxonomiesId() {
		super(OPERATION_PATH);
	}
	
}
