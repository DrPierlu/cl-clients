package io.commercelayer.api.operation;

import io.commercelayer.api.model.MerchandisingRule;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountMerchandisingRules
 */
public class PostAccountMerchandisingRules extends PostOperation<MerchandisingRule> {

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
	

	public Class<MerchandisingRule> getResourceType() {
		return MerchandisingRule.class;
	}
	
}
