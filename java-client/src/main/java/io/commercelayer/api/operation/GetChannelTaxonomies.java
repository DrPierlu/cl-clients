package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetChannelTaxonomies
 */
public class GetChannelTaxonomies extends SearchOperation {

	public static final String OPERATION_PATH = "/channel/taxonomies";


	public GetChannelTaxonomies() {
		super(OPERATION_PATH);
	}
	
}
