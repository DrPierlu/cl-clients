package io.commercelayer.api.operation;

import io.commercelayer.api.model.MerchandisingRule;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountMerchandisingRules
 */
public class PostAccountMerchandisingRules extends PostOperation {

	public static final String OPERATION_PATH = "/account/merchandising_rules";


	{
		addRequiredField("catalogId");
		addRequiredField("productId");
		addRequiredField("taxonId");
		addRequiredField("position");
		addRequiredField("hero");
	}


	public PostAccountMerchandisingRules() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return MerchandisingRule.class;
	}
	
}
