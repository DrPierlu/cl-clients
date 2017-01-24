package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.StockLocation;
import io.commercelayer.api.operation.DeleteAccountStockLocationsId;
import io.commercelayer.api.operation.GetAccountStockLocationsId;
import io.commercelayer.api.operation.PostAccountStockLocations;
import io.commercelayer.api.operation.PutAccountStockLocationsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * StockLocationTest
 */
public class StockLocationTest extends IntegrationTest<StockLocation> {

	@Override
	public ApiResponse<StockLocation> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountStockLocations postOp = ApiOperations.PostAccountStockLocations();
	
		StockLocation res = new StockLocation();
	
		res.setName("name");
		// FIELD NOT FOUND -> res.setAddressId("addressId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountStockLocations> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<StockLocation> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getName());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getAddressId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<StockLocation> crudReadTest(StockLocation res, ApiCaller caller) {
	
		// GET
	
		GetAccountStockLocationsId getOp = ApiOperations.GetAccountStockLocationsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountStockLocationsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<StockLocation> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<StockLocation> crudUpdateTest(StockLocation oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountStockLocationsId putOp = ApiOperations.PutAccountStockLocationsId();
		putOp.setId(oldRes.getId());
	
		StockLocation res = new StockLocation();
	
		res.setName(randomField(oldRes.getName()));
		// FIELD NOT FOUND -> res.setAddressId(randomField(oldRes.getAddressId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountStockLocationsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<StockLocation> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getAddressId(), putRes.getResource().getAddressId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<StockLocation> crudDeleteTest(StockLocation res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountStockLocationsId delOp = ApiOperations.DeleteAccountStockLocationsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountStockLocationsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<StockLocation> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountStockLocationsId getOp = ApiOperations.GetAccountStockLocationsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountStockLocationsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<StockLocation> getRes = null;
	
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
	
		StockLocationTest test = new StockLocationTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
