package io.commercelayer.api.test.generated;

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
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * AddressTest
 */
public class AddressTest extends IntegrationTest<Address> {

	@Override
	public ApiResponse<Address> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountAddresses postOp = ApiOperations.PostAccountAddresses();
	
		Address res = new Address();
	
		// FIELD NOT FOUND -> res.setGeocodingNumber("3");
		// FIELD NOT FOUND -> res.setGeocodingCountry(io.commercelayer.api.domain.Country.ITALY);
		// FIELD NOT FOUND -> res.setGeocodingCity("Siena");
		// FIELD NOT FOUND -> res.setGeocodingZip("53100");
		// FIELD NOT FOUND -> res.setGeocodingStreet("Via delle Luglie");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountAddresses> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Address> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getGeocodingNumber());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getGeocodingCountry());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getGeocodingCity());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getGeocodingZip());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getGeocodingStreet());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Address> crudReadTest(Address res, ApiCaller caller) {
	
		// GET
	
		GetAccountAddressesId getOp = ApiOperations.GetAccountAddressesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountAddressesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Address> getRes = test(getReq, caller);
	
	
		Assert.assertNotNull(getRes.getResource().getLng());
		Assert.assertNotNull(getRes.getResource().getLat());
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Address> crudUpdateTest(Address oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountAddressesId putOp = ApiOperations.PutAccountAddressesId();
		putOp.setId(oldRes.getId());
	
		Address res = new Address();
	
		res.setGeocodingNumber("2");
		res.setGeocodingStreet("Viale Sardegna");
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountAddressesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Address> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getGeocodingNumber(), putRes.getResource().getGeocodingNumber());
		Assert.assertNotEquals(oldRes.getGeocodingStreet(), putRes.getResource().getGeocodingStreet());
	
	
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
	
		ApiResponse<Address> getRes = null;
	
		try {
			getRes = test(getReq, caller, false);
		}
		catch (TestException te) {
			if (te.causedByApiError()) {
				Assert.assertTrue(te.getError().getHttpErrorCode() == 404);
				Assert.assertNull(getRes);
			}
			else throw te;
		}
	
	
		return delRes;
	
	}
	

	public static void main(String[] args) {
	
		AddressTest test = new AddressTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
