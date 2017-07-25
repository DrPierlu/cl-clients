package io.commercelayer.api.operation;

import io.commercelayer.api.model.Merchant;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountMerchants
 */
public class PostAccountMerchants extends PostOperation<Merchant> {

	public static final String OPERATION_PATH = "/account/merchants";


	{
		addRequiredField("name");
		addRequiredField("addressId");
		addRequiredField("description");
		addRequiredField("marketIds");
		addRequiredField("gatewayIds");
		addRequiredField("orderIds");
		addRequiredField("paymentTypeIds");
	}


	public PostAccountMerchants() {
		super(OPERATION_PATH);
	}
	

	public Class<Merchant> getResourceType() {
		return Merchant.class;
	}
	
}
