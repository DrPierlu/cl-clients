package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingPackage;
import io.commercelayer.api.operation.DeleteAccountShippingPackagesId;
import io.commercelayer.api.operation.GetAccountShippingPackagesId;
import io.commercelayer.api.operation.PostAccountShippingPackages;
import io.commercelayer.api.operation.PutAccountShippingPackagesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ShippingPackageTest
 */
public class ShippingPackageTest extends IntegrationTest<ShippingPackage> {

	@Override
	public ApiResponse<ShippingPackage> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountShippingPackages postOp = ApiOperations.PostAccountShippingPackages();
	
		ShippingPackage res = new ShippingPackage();
	
		res.setName("name");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountShippingPackages> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<ShippingPackage> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getName());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<ShippingPackage> crudReadTest(ShippingPackage res, ApiCaller caller) {
	
		// GET
	
		GetAccountShippingPackagesId getOp = ApiOperations.GetAccountShippingPackagesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountShippingPackagesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingPackage> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<ShippingPackage> crudUpdateTest(ShippingPackage oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountShippingPackagesId putOp = ApiOperations.PutAccountShippingPackagesId();
		putOp.setId(oldRes.getId());
	
		ShippingPackage res = new ShippingPackage();
	
		res.setName(randomField(oldRes.getName()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountShippingPackagesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<ShippingPackage> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<ShippingPackage> crudDeleteTest(ShippingPackage res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountShippingPackagesId delOp = ApiOperations.DeleteAccountShippingPackagesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountShippingPackagesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<ShippingPackage> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountShippingPackagesId getOp = ApiOperations.GetAccountShippingPackagesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountShippingPackagesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingPackage> getRes = null;
	
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
	
		ShippingPackageTest test = new ShippingPackageTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
