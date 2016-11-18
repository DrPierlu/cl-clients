package io.commercelayer.api;

import io.commercelayer.api.config.ResourceCatalog;
import io.commercelayer.api.exception.ApiException;
import io.commercelayer.api.model.Address;
import io.commercelayer.api.search.ApiSearchRequest;
import io.commercelayer.api.search.ApiSearchResponse;
import io.commercelayer.api.security.ApiToken;

public class AddressesCaller extends ApiCaller {
	
	public AddressesCaller(ApiToken apiToken) {
		super(apiToken);
	}
	
	public Address insertAddress(Address address) throws ApiException {
		return (Address)insertItem(address);
	}
	
	public Address updateAddress(Address address) throws ApiException {
		return (Address)updateItem(address);
	}
	
	public Address getAddress(Long id) throws ApiException {
		return getItem(id, Address.class);
	}
	
	public void deleteAddress(Long id) throws ApiException {
		deleteItem(id);
	}
	
	public ApiSearchResponse<Address> getAddressList(ApiSearchRequest searchRequest) throws ApiException {
		return getItemList(searchRequest, Address.class);
	}
	
	

	@Override
	protected String getResourcePath() {
		return ResourceCatalog.ADDRESSES.path();
	}

}
