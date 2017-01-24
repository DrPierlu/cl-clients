package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ProductType;
import io.commercelayer.api.operation.DeleteAccountProductTypesId;
import io.commercelayer.api.operation.GetAccountProductTypesId;
import io.commercelayer.api.operation.PostAccountProductTypes;
import io.commercelayer.api.operation.PutAccountProductTypesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ProductTypeTest
 */
public class ProductTypeTest extends IntegrationTest<ProductType> {

	@Override
	public ApiResponse<ProductType> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountProductTypes postOp = ApiOperations.PostAccountProductTypes();
	
		ProductType res = new ProductType();
	
		res.setName("name");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountProductTypes> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<ProductType> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getName());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<ProductType> crudReadTest(ProductType res, ApiCaller caller) {
	
		// GET
	
		GetAccountProductTypesId getOp = ApiOperations.GetAccountProductTypesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountProductTypesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ProductType> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<ProductType> crudUpdateTest(ProductType oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountProductTypesId putOp = ApiOperations.PutAccountProductTypesId();
		putOp.setId(oldRes.getId());
	
		ProductType res = new ProductType();
	
		res.setName(randomField(oldRes.getName()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountProductTypesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<ProductType> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<ProductType> crudDeleteTest(ProductType res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountProductTypesId delOp = ApiOperations.DeleteAccountProductTypesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountProductTypesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<ProductType> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountProductTypesId getOp = ApiOperations.GetAccountProductTypesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountProductTypesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ProductType> getRes = null;
	
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
	
		ProductTypeTest test = new ProductTypeTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
