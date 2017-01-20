package io.commercelayer.api.test.integration;

import org.junit.Assert;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Address;
import io.commercelayer.api.operation.DeleteAccountAddressesId;
import io.commercelayer.api.operation.GetAccountAddressesId;
import io.commercelayer.api.operation.PostAccountAddresses;
import io.commercelayer.api.operation.PutAccountAddressesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;

/**
 * AddressTest
 */
public class AddressTest extends IntegrationTest<Address> {

	@Override
	public ApiResponse<Address> crudCreateTest(ApiCaller caller) {

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
		
		ApiResponse<Address> postRes = test(postReq, caller);

		Assert.assertNotNull(postRes.getResource().getId());
		Assert.assertNotNull(postRes.getResource().getLat());
		Assert.assertNotNull(postRes.getResource().getLng());

		return postRes;

	}

	@Override
	public ApiResponse<Address> crudReadTest(Address res, ApiCaller caller) {

		// GET

		GetAccountAddressesId getOp = ApiOperations.GetAccountAddressesId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountAddressesId> getReq = new ApiRequest<>(getOp);
		
		ApiResponse<Address> getRes = test(getReq, caller);

		Assert.assertNotNull(getRes.getResource().getLat());
		Assert.assertNotNull(getRes.getResource().getLng());

		return getRes;

	}

	@Override
	public ApiResponse<Address> crudUpdateTest(Address oldRes, ApiCaller caller) {

		// PUT

		PutAccountAddressesId putOp = ApiOperations.PutAccountAddressesId();
		putOp.setId(oldRes.getId());

		Address a = new Address();

		a.setGeocodingStreet("Viale Sardegna");
		a.setGeocodingNumber("2");

		putOp.setPayload(a);

		ApiRequest<PutAccountAddressesId> putReq = new ApiRequest<>(putOp);
		
		ApiResponse<Address> putRes = test(putReq, caller);

		Assert.assertNotEquals(oldRes.getGeocodingStreet(), putRes.getResource().getGeocodingStreet());
		Assert.assertNotEquals(oldRes.getGeocodingNumber(), putRes.getResource().getGeocodingNumber());
		Assert.assertNotEquals(oldRes.getLat(), putRes.getResource().getLat());
		Assert.assertNotEquals(oldRes.getLng(), putRes.getResource().getLng());

		return putRes;

	}

	@Override
	public ApiResponse<Address> crudDeleteTest(Address res, ApiCaller caller) {

		// DELETE

		DeleteAccountAddressesId delOp = ApiOperations.DeleteAccountAddressesId();
		delOp.setId(res.getId());

		ApiRequest<DeleteAccountAddressesId> delReq = new ApiRequest<>(delOp);
		
		ApiResponse<Address> delRes = test(delReq, caller);

		// GET

		GetAccountAddressesId getOp = ApiOperations.GetAccountAddressesId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountAddressesId> getReq = new ApiRequest<>(getOp);
		
		ApiResponse<Address> getRes = test(getReq, caller, false);

		Assert.assertNull(getRes.getResource());

		return delRes;

	}

	public static void main(String[] args) {

		AddressTest test = new AddressTest();

		test.runTest();

		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();

	}

}
