package io.commercelayer.api.operation;

import io.commercelayer.api.model.Taxonomy;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountTaxonomies
 */
public class PostAccountTaxonomies extends PostOperation {

	public static final String OPERATION_PATH = "/account/taxonomies";


	{
		addRequiredField("name");
	}


	public PostAccountTaxonomies() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Taxonomy.class;
	}
	
}
