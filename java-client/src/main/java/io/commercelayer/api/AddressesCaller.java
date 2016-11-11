package io.commercelayer.api;

import java.util.List;

import io.commercelayer.api.exception.ApiException;
import io.commercelayer.api.model.Address;
import io.commercelayer.api.security.ApiToken;

public class AddressesCaller extends ApiCaller {
	
	public AddressesCaller(ApiToken apiToken) {
		super(apiToken);
	}
	
	public void insertAddress(Address address) throws ApiException {
		insertItem(address);
	}
	
	public Address getAddress(String id) throws ApiException {
		return getItem(id, Address.class);
	}
	
	public List<Address> getAddressList() throws ApiException {
		return getItemList(Address.class);
	}


	@Override
	protected String getResourcePath() {
		return "/account/addresses";
	}

}
