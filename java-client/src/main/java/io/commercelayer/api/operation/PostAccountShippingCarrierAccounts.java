package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingCarrierAccount;
import io.commercelayer.api.operation.common.PostOperation;


/**
 * PostAccountShippingCarrierAccounts
 */
public class PostAccountShippingCarrierAccounts extends PostOperation<ShippingCarrierAccount> {

	public static final String OPERATION_PATH = "/account/shipping_carrier_accounts";


	{
		addRequiredField("shippingCarrierId");
	}


	public PostAccountShippingCarrierAccounts() {
		super(OPERATION_PATH);
	}
	

	public Class<ShippingCarrierAccount> getResourceType() {
		return ShippingCarrierAccount.class;
	}
	
}
