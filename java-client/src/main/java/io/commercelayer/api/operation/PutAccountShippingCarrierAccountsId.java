package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingCarrierAccount;
import io.commercelayer.api.operation.common.PutOperation;


/**
 * PutAccountShippingCarrierAccountsId
 */
public class PutAccountShippingCarrierAccountsId extends PutOperation<ShippingCarrierAccount> {

	public static final String OPERATION_PATH = "/account/shipping_carrier_accounts/{id}";


	{
		addRequiredField("shippingCarrierId");
	}


	public PutAccountShippingCarrierAccountsId() {
		super(OPERATION_PATH);
	}
	

	public PutAccountShippingCarrierAccountsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingCarrierAccount> getResourceType() {
		return ShippingCarrierAccount.class;
	}
	
}
