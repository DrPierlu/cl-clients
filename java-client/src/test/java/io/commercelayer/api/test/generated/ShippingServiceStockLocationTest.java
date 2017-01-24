package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingServiceStockLocation;
import io.commercelayer.api.operation.DeleteAccountShippingServiceStockLocationsId;
import io.commercelayer.api.operation.GetAccountShippingServiceStockLocationsId;
import io.commercelayer.api.operation.PostAccountShippingServiceStockLocations;
import io.commercelayer.api.operation.PutAccountShippingServiceStockLocationsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ShippingServiceStockLocationTest
 */
public class ShippingServiceStockLocationTest extends IntegrationTest<ShippingServiceStockLocation> {

	@Override
	public ApiResponse<ShippingServiceStockLocation> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountShippingServiceStockLocations postOp = ApiOperations.PostAccountShippingServiceStockLocations();
	
		ShippingServiceStockLocation res = new ShippingServiceStockLocation();
	
		// FIELD NOT FOUND -> res.setMinLeadTimeHours("minLeadTimeHours");
		// FIELD NOT FOUND -> res.setShippingServiceId("shippingServiceId");
		// FIELD NOT FOUND -> res.setMaxLeadTimeHours("maxLeadTimeHours");
		// FIELD NOT FOUND -> res.setStockLocationId("stockLocationId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountShippingServiceStockLocations> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<ShippingServiceStockLocation> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getMinLeadTimeHours());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShippingServiceId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getMaxLeadTimeHours());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getStockLocationId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<ShippingServiceStockLocation> crudReadTest(ShippingServiceStockLocation res, ApiCaller caller) {
	
		// GET
	
		GetAccountShippingServiceStockLocationsId getOp = ApiOperations.GetAccountShippingServiceStockLocationsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountShippingServiceStockLocationsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingServiceStockLocation> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<ShippingServiceStockLocation> crudUpdateTest(ShippingServiceStockLocation oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountShippingServiceStockLocationsId putOp = ApiOperations.PutAccountShippingServiceStockLocationsId();
		putOp.setId(oldRes.getId());
	
		ShippingServiceStockLocation res = new ShippingServiceStockLocation();
	
		// FIELD NOT FOUND -> res.setMinLeadTimeHours(randomField(oldRes.getMinLeadTimeHours()));
		// FIELD NOT FOUND -> res.setShippingServiceId(randomField(oldRes.getShippingServiceId()));
		// FIELD NOT FOUND -> res.setMaxLeadTimeHours(randomField(oldRes.getMaxLeadTimeHours()));
		// FIELD NOT FOUND -> res.setStockLocationId(randomField(oldRes.getStockLocationId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountShippingServiceStockLocationsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<ShippingServiceStockLocation> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getMinLeadTimeHours(), putRes.getResource().getMinLeadTimeHours());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShippingServiceId(), putRes.getResource().getShippingServiceId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getMaxLeadTimeHours(), putRes.getResource().getMaxLeadTimeHours());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getStockLocationId(), putRes.getResource().getStockLocationId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<ShippingServiceStockLocation> crudDeleteTest(ShippingServiceStockLocation res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountShippingServiceStockLocationsId delOp = ApiOperations.DeleteAccountShippingServiceStockLocationsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountShippingServiceStockLocationsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<ShippingServiceStockLocation> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountShippingServiceStockLocationsId getOp = ApiOperations.GetAccountShippingServiceStockLocationsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountShippingServiceStockLocationsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingServiceStockLocation> getRes = null;
	
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
	
		ShippingServiceStockLocationTest test = new ShippingServiceStockLocationTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
