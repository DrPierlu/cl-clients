package io.commercelayer.api.test;

import org.junit.Assert;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Address;
import io.commercelayer.api.operation.GetAccountAddressesId;
import io.commercelayer.api.operation.PostAccountAddresses;
import io.commercelayer.api.operation.PutAccountAddressesId;
import io.commercelayer.api.operation.common.ApiOperations;
import io.commercelayer.api.operation.common.DeleteOperation;
import io.commercelayer.api.test.common.ApiTest;

public class AddressTest extends ApiTest<Address> {

	@Override
	public void runTest() {
		
		ApiCaller caller = getApiCaller();
		
		// POST
		
		PostAccountAddresses postOp = ApiOperations.PostAccountAddresses();
		
		Address a = new Address();
		
		a.setGeocodingCity("Siena");
		a.setGeocodingCountry("IT");
		a.setGeocodingNumber("3");
		a.setGeocodingStreet("Via delle Luglie");
		a.setGeocodingZip("53100");
		
		postOp.setPayload(a);
		
		ApiRequest<PostAccountAddresses> postReq = new ApiRequest<>(postOp);
		ApiResponse<Address> postRes = test (postReq, Address.class, caller);
		
		a.setId(postRes.getResource().getId());
		
		
		// GET
		
		GetAccountAddressesId getOp = ApiOperations.GetAccountAddressesId();
		getOp.setId(postRes.getResource().getId());
		
		ApiRequest<GetAccountAddressesId> getReq = new ApiRequest<>(getOp);
		
		ApiResponse<Address> getRes = test(getReq, Address.class, caller);
		
		
		// PUT
		
		PutAccountAddressesId putOp = ApiOperations.PutAccountAddressesId();
		putOp.setId(getRes.getResource().getId());
		
		a.setGeocodingStreet("Viale Sardegna");
		a.setGeocodingNumber("2");
		
		putOp.setPayload(a);
		
		ApiRequest<PutAccountAddressesId> putReq = new ApiRequest<>(putOp);
		@SuppressWarnings("unused")
		ApiResponse<Address> putRes = test(putReq, Address.class, caller);
		

		// GET
		
		getOp = ApiOperations.GetAccountAddressesId();
		getOp.setId(postRes.getResource().getId());
				
		getReq = new ApiRequest<>(getOp);
				
		getRes = test(getReq, Address.class, caller);
		
		Assert.assertNotEquals(postRes.getResource().getGeocodingStreet(), getRes.getResource().getGeocodingStreet());
		Assert.assertNotEquals(postRes.getResource().getGeocodingNumber(), getRes.getResource().getGeocodingNumber());
		Assert.assertNotEquals(postRes.getResource().getLat(), getRes.getResource().getLat());
		Assert.assertNotEquals(postRes.getResource().getLng(), getRes.getResource().getLng());
		
		
		// DELETE
		
		DeleteOperation delOp = ApiOperations.DeleteAccountAddressesId();
		delOp.setId(getOp.getId());
		
		ApiRequest<DeleteOperation> delRes = new ApiRequest<>(delOp);
		
		test(delRes, caller);
		
		
		// GET
		getRes = test(getReq, Address.class, caller, false);
		
		Assert.assertNull(getRes.getResource());
		Assert.assertNotNull(getRes.getApiError());
		
	}
	
	
	public static void main(String[] args) {
		new AddressTest().runTest();
	}
	
}
