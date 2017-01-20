package io.commercelayer.api.operation;

import io.commercelayer.api.model.Merchant;
import io.commercelayer.api.model.common.ApiResource;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountMerchants
 */
public class PostAccountMerchants extends PostOperation {

	public static final String OPERATION_PATH = "/account/merchants";


	{
		addRequiredField("name");
		addRequiredField("addressId");
		addRequiredField("description");
	}


	public PostAccountMerchants() {
		super(OPERATION_PATH);
	}
	

	public Class<? extends ApiResource> getResourceType() {
		return Merchant.class;
	}
	
}
