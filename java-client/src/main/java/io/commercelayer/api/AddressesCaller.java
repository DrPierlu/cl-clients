package io.commercelayer.api;

import java.util.List;

import io.commercelayer.api.exception.ApiException;
import io.commercelayer.api.model.Address;
import io.commercelayer.api.security.ApiToken;

public class AddressesCaller extends ApiCaller {
	
	public AddressesCaller(ApiToken apiToken) {
		super(apiToken);
	}
	
	public Address insertAddress(Address address) throws ApiException {
		return (Address)insertItem(address);
	}
	
	public void updateAddress(Address address) throws ApiException {
		updateItem(address);
	}
	
	public Address getAddress(Long id) throws ApiException {
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
