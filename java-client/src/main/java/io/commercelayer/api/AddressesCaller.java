package io.commercelayer.api;

import io.commercelayer.api.model.Address;
import io.commercelayer.api.security.ApiToken;

public class AddressesCaller extends ApiCaller {
	
	public AddressesCaller(ApiToken apiToken) {
		super(apiToken);
	}
	
	public void insertAddress(Address address) throws ApiException {
		
		insertItem(address);
		
	}
	
	
	public static void main(String[] args) {
		
		Address a = new Address();
		ApiToken t = new ApiToken();
		t.setAccessToken("xxx");
		t.setRefreshToken("yyy");
		
		try {
			new AddressesCaller(t).insertAddress(a);
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	@Override
	protected String getResourcePath() {
		return "/account/addresses";
	}

}
