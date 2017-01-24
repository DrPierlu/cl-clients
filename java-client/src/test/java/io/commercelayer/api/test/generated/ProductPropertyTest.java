package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ProductProperty;
import io.commercelayer.api.operation.DeleteAccountProductPropertiesId;
import io.commercelayer.api.operation.GetAccountProductPropertiesId;
import io.commercelayer.api.operation.PostAccountProductProperties;
import io.commercelayer.api.operation.PutAccountProductPropertiesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ProductPropertyTest
 */
public class ProductPropertyTest extends IntegrationTest<ProductProperty> {

	@Override
	public ApiResponse<ProductProperty> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountProductProperties postOp = ApiOperations.PostAccountProductProperties();
	
		ProductProperty res = new ProductProperty();
	
		// FIELD NOT FOUND -> res.setProductId("productId");
		// FIELD NOT FOUND -> res.setPropertyValueId("propertyValueId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountProductProperties> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<ProductProperty> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getProductId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPropertyValueId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<ProductProperty> crudReadTest(ProductProperty res, ApiCaller caller) {
	
		// GET
	
		GetAccountProductPropertiesId getOp = ApiOperations.GetAccountProductPropertiesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountProductPropertiesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ProductProperty> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<ProductProperty> crudUpdateTest(ProductProperty oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountProductPropertiesId putOp = ApiOperations.PutAccountProductPropertiesId();
		putOp.setId(oldRes.getId());
	
		ProductProperty res = new ProductProperty();
	
		// FIELD NOT FOUND -> res.setProductId(randomField(oldRes.getProductId()));
		// FIELD NOT FOUND -> res.setPropertyValueId(randomField(oldRes.getPropertyValueId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountProductPropertiesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<ProductProperty> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getProductId(), putRes.getResource().getProductId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPropertyValueId(), putRes.getResource().getPropertyValueId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<ProductProperty> crudDeleteTest(ProductProperty res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountProductPropertiesId delOp = ApiOperations.DeleteAccountProductPropertiesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountProductPropertiesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<ProductProperty> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountProductPropertiesId getOp = ApiOperations.GetAccountProductPropertiesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountProductPropertiesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ProductProperty> getRes = null;
	
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
	
		ProductPropertyTest test = new ProductPropertyTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
