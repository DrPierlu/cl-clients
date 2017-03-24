package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingCarrierAccount;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountShippingCarrierAccounts
 */
public class GetAccountShippingCarrierAccounts extends SearchOperation<ShippingCarrierAccount> {

	public static final String OPERATION_PATH = "/account/shipping_carrier_accounts";


	public GetAccountShippingCarrierAccounts() {
		super(OPERATION_PATH);
	}
	

	public Class<ShippingCarrierAccount> getResourceType() {
		return ShippingCarrierAccount.class;
	}
	
}
