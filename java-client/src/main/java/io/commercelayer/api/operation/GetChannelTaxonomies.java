package io.commercelayer.api.operation;

import io.commercelayer.api.model.Taxonomy;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetChannelTaxonomies
 */
public class GetChannelTaxonomies extends SearchOperation {

	public static final String OPERATION_PATH = "/channel/taxonomies";


	public GetChannelTaxonomies() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Taxonomy.class;
	}
	
}
