package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingZone;
import io.commercelayer.api.operation.DeleteAccountShippingZonesId;
import io.commercelayer.api.operation.GetAccountShippingZonesId;
import io.commercelayer.api.operation.PostAccountShippingZones;
import io.commercelayer.api.operation.PutAccountShippingZonesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ShippingZoneTest
 */
public class ShippingZoneTest extends IntegrationTest<ShippingZone> {

	@Override
	public ApiResponse<ShippingZone> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountShippingZones postOp = ApiOperations.PostAccountShippingZones();
	
		ShippingZone res = new ShippingZone();
	
		// FIELD NOT FOUND -> res.setZipCodeRegex("zipCodeRegex");
		// FIELD NOT FOUND -> res.setNotZipCodeRegex("notZipCodeRegex");
		res.setName("name");
		// FIELD NOT FOUND -> res.setStateCodeRegex("stateCodeRegex");
		// FIELD NOT FOUND -> res.setNotCountryCodeRegex("notCountryCodeRegex");
		// FIELD NOT FOUND -> res.setCountryGroupId("countryGroupId");
		// FIELD NOT FOUND -> res.setCountryCodeRegex("countryCodeRegex");
		// FIELD NOT FOUND -> res.setNotStateCodeRegex("notStateCodeRegex");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountShippingZones> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<ShippingZone> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getZipCodeRegex());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getNotZipCodeRegex());
		Assert.assertNotNull(postRes.getResource().getName());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getStateCodeRegex());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getNotCountryCodeRegex());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getCountryGroupId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getCountryCodeRegex());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getNotStateCodeRegex());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<ShippingZone> crudReadTest(ShippingZone res, ApiCaller caller) {
	
		// GET
	
		GetAccountShippingZonesId getOp = ApiOperations.GetAccountShippingZonesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountShippingZonesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingZone> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<ShippingZone> crudUpdateTest(ShippingZone oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountShippingZonesId putOp = ApiOperations.PutAccountShippingZonesId();
		putOp.setId(oldRes.getId());
	
		ShippingZone res = new ShippingZone();
	
		// FIELD NOT FOUND -> res.setZipCodeRegex(randomField(oldRes.getZipCodeRegex()));
		// FIELD NOT FOUND -> res.setNotZipCodeRegex(randomField(oldRes.getNotZipCodeRegex()));
		res.setName(randomField(oldRes.getName()));
		// FIELD NOT FOUND -> res.setStateCodeRegex(randomField(oldRes.getStateCodeRegex()));
		// FIELD NOT FOUND -> res.setNotCountryCodeRegex(randomField(oldRes.getNotCountryCodeRegex()));
		// FIELD NOT FOUND -> res.setCountryGroupId(randomField(oldRes.getCountryGroupId()));
		// FIELD NOT FOUND -> res.setCountryCodeRegex(randomField(oldRes.getCountryCodeRegex()));
		// FIELD NOT FOUND -> res.setNotStateCodeRegex(randomField(oldRes.getNotStateCodeRegex()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountShippingZonesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<ShippingZone> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getZipCodeRegex(), putRes.getResource().getZipCodeRegex());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getNotZipCodeRegex(), putRes.getResource().getNotZipCodeRegex());
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getStateCodeRegex(), putRes.getResource().getStateCodeRegex());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getNotCountryCodeRegex(), putRes.getResource().getNotCountryCodeRegex());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getCountryGroupId(), putRes.getResource().getCountryGroupId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getCountryCodeRegex(), putRes.getResource().getCountryCodeRegex());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getNotStateCodeRegex(), putRes.getResource().getNotStateCodeRegex());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<ShippingZone> crudDeleteTest(ShippingZone res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountShippingZonesId delOp = ApiOperations.DeleteAccountShippingZonesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountShippingZonesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<ShippingZone> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountShippingZonesId getOp = ApiOperations.GetAccountShippingZonesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountShippingZonesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingZone> getRes = null;
	
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
	
		ShippingZoneTest test = new ShippingZoneTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
