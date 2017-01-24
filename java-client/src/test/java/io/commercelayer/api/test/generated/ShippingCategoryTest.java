package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingCategory;
import io.commercelayer.api.operation.DeleteAccountShippingCategoriesId;
import io.commercelayer.api.operation.GetAccountShippingCategoriesId;
import io.commercelayer.api.operation.PostAccountShippingCategories;
import io.commercelayer.api.operation.PutAccountShippingCategoriesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ShippingCategoryTest
 */
public class ShippingCategoryTest extends IntegrationTest<ShippingCategory> {

	@Override
	public ApiResponse<ShippingCategory> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountShippingCategories postOp = ApiOperations.PostAccountShippingCategories();
	
		ShippingCategory res = new ShippingCategory();
	
		res.setName("name");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountShippingCategories> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<ShippingCategory> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getName());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<ShippingCategory> crudReadTest(ShippingCategory res, ApiCaller caller) {
	
		// GET
	
		GetAccountShippingCategoriesId getOp = ApiOperations.GetAccountShippingCategoriesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountShippingCategoriesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingCategory> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<ShippingCategory> crudUpdateTest(ShippingCategory oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountShippingCategoriesId putOp = ApiOperations.PutAccountShippingCategoriesId();
		putOp.setId(oldRes.getId());
	
		ShippingCategory res = new ShippingCategory();
	
		res.setName(randomField(oldRes.getName()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountShippingCategoriesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<ShippingCategory> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<ShippingCategory> crudDeleteTest(ShippingCategory res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountShippingCategoriesId delOp = ApiOperations.DeleteAccountShippingCategoriesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountShippingCategoriesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<ShippingCategory> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountShippingCategoriesId getOp = ApiOperations.GetAccountShippingCategoriesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountShippingCategoriesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingCategory> getRes = null;
	
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
	
		ShippingCategoryTest test = new ShippingCategoryTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
