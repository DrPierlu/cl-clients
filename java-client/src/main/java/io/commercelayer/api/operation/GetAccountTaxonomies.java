package io.commercelayer.api.operation;

import io.commercelayer.api.model.Taxonomy;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountTaxonomies
 */
public class GetAccountTaxonomies extends SearchOperation {

	public static final String OPERATION_PATH = "/account/taxonomies";


	public GetAccountTaxonomies() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Taxonomy.class;
	}
	
}
