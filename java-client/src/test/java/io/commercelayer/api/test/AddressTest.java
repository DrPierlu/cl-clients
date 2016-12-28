package io.commercelayer.api.test;

import org.junit.Assert;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.exception.ApiException;
import io.commercelayer.api.model.Address;
import io.commercelayer.api.operation.GetAccountAddressesId;
import io.commercelayer.api.operation.PostAccountAddresses;
import io.commercelayer.api.operation.PutAccountAddressesId;
import io.commercelayer.api.operation.common.ApiOperations;
import io.commercelayer.api.operation.common.DeleteOperation;
import io.commercelayer.api.test.common.IntegrationTest;

public class AddressTest extends IntegrationTest<Address> {

	@Override
	public ApiResponse<Address> testInsert(ApiCaller caller) {
		
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
		ApiResponse<Address> postRes = test(postReq, Address.class, caller);
		
		a.setId(postRes.getResource().getId());
		
		
		// GET
		
		GetAccountAddressesId getOp = ApiOperations.GetAccountAddressesId();
		getOp.setId(postRes.getResource().getId());
		
		ApiRequest<GetAccountAddressesId> getReq = new ApiRequest<>(getOp);
		
		ApiResponse<Address> getRes = test(getReq, Address.class, caller);
		
		Assert.assertNotNull(getRes.getResource().getLat());
		Assert.assertNotNull(getRes.getResource().getLng());
		
		return postRes;
		
	}


	@Override
	public ApiResponse<Address> testUpdate(Address insRes, ApiCaller caller) {
		
		// PUT
		
		PutAccountAddressesId putOp = ApiOperations.PutAccountAddressesId();
		putOp.setId(insRes.getId());
		
		Address a = new Address();
		
		a.setGeocodingStreet("Viale Sardegna");
		a.setGeocodingNumber("2");
		
		putOp.setPayload(a);
		
		ApiRequest<PutAccountAddressesId> putReq = new ApiRequest<>(putOp);
		ApiResponse<Address> putRes = test(putReq, Address.class, caller);
		

		// GET
		
		GetAccountAddressesId getOp = ApiOperations.GetAccountAddressesId();
		getOp.setId(insRes.getId());
				
		ApiRequest<GetAccountAddressesId> getReq = new ApiRequest<>(getOp);
		
		ApiResponse<Address> getRes = test(getReq, Address.class, caller);
		
		Assert.assertNotEquals(insRes.getGeocodingStreet(), getRes.getResource().getGeocodingStreet());
		Assert.assertNotEquals(insRes.getGeocodingNumber(), getRes.getResource().getGeocodingNumber());
		Assert.assertNotEquals(insRes.getLat(), getRes.getResource().getLat());
		Assert.assertNotEquals(insRes.getLng(), getRes.getResource().getLng());
		
		return putRes;

	}


	@Override
	public ApiResponse<Address> testDelete(Address updRes, ApiCaller caller) {
		
		// DELETE
		
		DeleteOperation delOp = ApiOperations.DeleteAccountAddressesId();
		delOp.setId(updRes.getId());
		
		ApiRequest<DeleteOperation> delReq = new ApiRequest<>(delOp);
		
		ApiResponse<Address> delRes = test(delReq, caller);
		
		
		// GET
		
		GetAccountAddressesId getOp = ApiOperations.GetAccountAddressesId();
		getOp.setId(updRes.getId());
				
		ApiRequest<GetAccountAddressesId> getReq = new ApiRequest<>(getOp);
				
		ApiResponse<Address> getRes = test(getReq, Address.class, caller);
		
		Assert.assertNull(getRes.getResource());
		Assert.assertNotNull(getRes.getApiError());
		
		return delRes;
		
	}
	
	
	public static void main(String[] args) throws ApiException {
		new AddressTest().runTest();
	}
	
}
