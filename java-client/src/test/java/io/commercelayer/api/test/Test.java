package io.commercelayer.api.test;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.config.ApiConfig;
import io.commercelayer.api.config.ApiConfig.Group;
import io.commercelayer.api.exception.ApiException;
import io.commercelayer.api.model.Address;
import io.commercelayer.api.operation.PostAccountAddresses;
import io.commercelayer.api.operation.common.PostOperation;
import io.commercelayer.api.security.ApiAccount;
import io.commercelayer.api.security.ApiAuthenticator;
import io.commercelayer.api.security.ApiToken;

public class Test {

	public static void main(String[] args) {
		
		ApiAccount account = new ApiAccount();
		account.setUsername(ApiConfig.getProperty(Group.authentication, "username"));
		account.setEnvironmentId(ApiConfig.getProperty(Group.authentication, "environmentId"));
		account.setAuthKey(ApiConfig.getProperty(Group.authentication, "authKey"));
		account.setAuthSecret(ApiConfig.getProperty(Group.authentication, "authSecret"));
		
		ApiAuthenticator auth = new ApiAuthenticator();
		ApiToken apiToken = auth.authenticate(account);
		
		
		ApiCaller caller = new ApiCaller(apiToken);
		
		ApiRequest<PostOperation> post = new ApiRequest<>();
		PostAccountAddresses op = new PostAccountAddresses();
		post.setOperation(op);
		
		Address a = new Address();
		a.setGeocodingCity("Milano");
		a.setGeocodingCountry("IT");
		a.setGeocodingNumber("10");
		a.setGeocodingStreet("Via Giuseppe Verdi");
		a.setGeocodingZip("20121");	// 20121
		
		op.setPayload(a);
		
		
		try {
			
			ApiResponse<Address> response = caller.post(post, Address.class);
			if (response.hasError()) System.out.println(response.getApiError().getError());
			else System.out.println(response.getResource());
			
		} catch (ApiException e) {
			e.printStackTrace();
		}
		
	}
	
}
