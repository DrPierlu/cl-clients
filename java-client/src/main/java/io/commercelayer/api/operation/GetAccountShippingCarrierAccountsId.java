package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingCarrierAccount;
import io.commercelayer.api.operation.common.GetIdOperation;


/**
 * GetAccountShippingCarrierAccountsId
 */
public class GetAccountShippingCarrierAccountsId extends GetIdOperation<ShippingCarrierAccount> {

	public static final String OPERATION_PATH = "/account/shipping_carrier_accounts/{id}";


	public GetAccountShippingCarrierAccountsId() {
		super(OPERATION_PATH);
	}
	

	public GetAccountShippingCarrierAccountsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingCarrierAccount> getResourceType() {
		return ShippingCarrierAccount.class;
	}
	
}
