package io.commercelayer.api.operation;

import io.commercelayer.api.model.Address;
import io.commercelayer.api.operation.common.SearchOperation;


/**
 * GetAccountAddresses
 */
public class GetAccountAddresses extends SearchOperation<Address> {

	public static final String OPERATION_PATH = "/account/addresses";


	public GetAccountAddresses() {
		super(OPERATION_PATH);
	}
	

	public Class<Address> getResourceType() {
		return Address.class;
	}
	
}
