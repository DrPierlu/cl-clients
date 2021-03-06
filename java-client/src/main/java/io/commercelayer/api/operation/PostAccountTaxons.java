package io.commercelayer.api.operation;

import io.commercelayer.api.model.Taxon;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountTaxons
 */
public class PostAccountTaxons extends PostOperation<Taxon> {

	public static final String OPERATION_PATH = "/account/taxons";


	{
		addRequiredField("taxonomyId");
		addRequiredField("name");
		addRequiredField("parentId");
		addRequiredField("resourceImageIds");
		addRequiredField("imageIds");
		addRequiredField("merchandisingRuleIds");
		addRequiredField("productIds");
		addRequiredField("childIds");
		addRequiredField("descendantHierarchyIds");
		addRequiredField("selfAndDescendantIds");
	}


	public PostAccountTaxons() {
		super(OPERATION_PATH);
	}
	

	public Class<Taxon> getResourceType() {
		return Taxon.class;
	}
	
}
