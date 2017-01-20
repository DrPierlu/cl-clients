package io.commercelayer.api.operation;

import io.commercelayer.api.model.Taxon;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountTaxons
 */
public class PostAccountTaxons extends PostOperation {

	public static final String OPERATION_PATH = "/account/taxons";


	{
		addRequiredField("taxonomyId");
		addRequiredField("name");
		addRequiredField("parentId");
	}


	public PostAccountTaxons() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Taxon.class;
	}
	
}
