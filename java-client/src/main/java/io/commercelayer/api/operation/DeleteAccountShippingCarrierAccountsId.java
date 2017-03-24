package io.commercelayer.api.operation;

import io.commercelayer.api.model.ShippingCarrierAccount;
import io.commercelayer.api.operation.common.DeleteOperation;


/**
 * DeleteAccountShippingCarrierAccountsId
 */
public class DeleteAccountShippingCarrierAccountsId extends DeleteOperation<ShippingCarrierAccount> {

	public static final String OPERATION_PATH = "/account/shipping_carrier_accounts/{id}";


	public DeleteAccountShippingCarrierAccountsId() {
		super(OPERATION_PATH);
	}
	

	public DeleteAccountShippingCarrierAccountsId(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ShippingCarrierAccount> getResourceType() {
		return ShippingCarrierAccount.class;
	}
	
}
