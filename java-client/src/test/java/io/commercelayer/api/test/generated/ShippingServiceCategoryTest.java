package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingServiceCategory;
import io.commercelayer.api.operation.DeleteAccountShippingServiceCategoriesId;
import io.commercelayer.api.operation.GetAccountShippingServiceCategoriesId;
import io.commercelayer.api.operation.PostAccountShippingServiceCategories;
import io.commercelayer.api.operation.PutAccountShippingServiceCategoriesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ShippingServiceCategoryTest
 */
public class ShippingServiceCategoryTest extends IntegrationTest<ShippingServiceCategory> {

	@Override
	public ApiResponse<ShippingServiceCategory> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountShippingServiceCategories postOp = ApiOperations.PostAccountShippingServiceCategories();
	
		ShippingServiceCategory res = new ShippingServiceCategory();
	
		// FIELD NOT FOUND -> res.setShippingCategoryId("shippingCategoryId");
		// FIELD NOT FOUND -> res.setShippingServiceId("shippingServiceId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountShippingServiceCategories> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<ShippingServiceCategory> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShippingCategoryId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShippingServiceId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<ShippingServiceCategory> crudReadTest(ShippingServiceCategory res, ApiCaller caller) {
	
		// GET
	
		GetAccountShippingServiceCategoriesId getOp = ApiOperations.GetAccountShippingServiceCategoriesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountShippingServiceCategoriesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingServiceCategory> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<ShippingServiceCategory> crudUpdateTest(ShippingServiceCategory oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountShippingServiceCategoriesId putOp = ApiOperations.PutAccountShippingServiceCategoriesId();
		putOp.setId(oldRes.getId());
	
		ShippingServiceCategory res = new ShippingServiceCategory();
	
		// FIELD NOT FOUND -> res.setShippingCategoryId(randomField(oldRes.getShippingCategoryId()));
		// FIELD NOT FOUND -> res.setShippingServiceId(randomField(oldRes.getShippingServiceId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountShippingServiceCategoriesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<ShippingServiceCategory> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShippingCategoryId(), putRes.getResource().getShippingCategoryId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShippingServiceId(), putRes.getResource().getShippingServiceId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<ShippingServiceCategory> crudDeleteTest(ShippingServiceCategory res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountShippingServiceCategoriesId delOp = ApiOperations.DeleteAccountShippingServiceCategoriesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountShippingServiceCategoriesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<ShippingServiceCategory> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountShippingServiceCategoriesId getOp = ApiOperations.GetAccountShippingServiceCategoriesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountShippingServiceCategoriesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingServiceCategory> getRes = null;
	
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
	
		ShippingServiceCategoryTest test = new ShippingServiceCategoryTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
