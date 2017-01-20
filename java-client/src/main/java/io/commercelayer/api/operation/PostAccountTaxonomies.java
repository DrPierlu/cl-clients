package io.commercelayer.api.operation;

import io.commercelayer.api.model.Taxonomy;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountTaxonomies
 */
public class PostAccountTaxonomies extends PostOperation<Taxonomy> {

	public static final String OPERATION_PATH = "/account/taxonomies";


	{
		addRequiredField("name");
	}


	public PostAccountTaxonomies() {
		super(OPERATION_PATH);
	}
	

	public Class<Taxonomy> getResourceType() {
		return Taxonomy.class;
	}
	
}
