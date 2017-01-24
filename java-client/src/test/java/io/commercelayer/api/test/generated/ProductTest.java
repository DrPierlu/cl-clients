package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Product;
import io.commercelayer.api.operation.DeleteAccountProductsId;
import io.commercelayer.api.operation.GetChannelProductsId;
import io.commercelayer.api.operation.PostChannelProducts;
import io.commercelayer.api.operation.PutAccountProductsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ProductTest
 */
public class ProductTest extends IntegrationTest<Product> {

	@Override
	public ApiResponse<Product> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostChannelProducts postOp = ApiOperations.PostChannelProducts();
	
		Product res = new Product();
	
		/* No payload data */
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostChannelProducts> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Product> postRes = test(postReq, caller);
	
	
		/* No test assertions */
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Product> crudReadTest(Product res, ApiCaller caller) {
	
		// GET
	
		GetChannelProductsId getOp = ApiOperations.GetChannelProductsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetChannelProductsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Product> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Product> crudUpdateTest(Product oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountProductsId putOp = ApiOperations.PutAccountProductsId();
		putOp.setId(oldRes.getId());
	
		Product res = new Product();
	
		res.setName(randomField(oldRes.getName()));
		res.setDescription(randomField(oldRes.getDescription()));
		// FIELD NOT FOUND -> res.setTaxCode(randomField(oldRes.getTaxCode()));
		// FIELD NOT FOUND -> res.setTrackInventory(randomField(oldRes.getTrackInventory()));
		// FIELD NOT FOUND -> res.setProductTypeId(randomField(oldRes.getProductTypeId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountProductsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Product> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
		Assert.assertNotEquals(oldRes.getDescription(), putRes.getResource().getDescription());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getTaxCode(), putRes.getResource().getTaxCode());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getTrackInventory(), putRes.getResource().getTrackInventory());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getProductTypeId(), putRes.getResource().getProductTypeId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<Product> crudDeleteTest(Product res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountProductsId delOp = ApiOperations.DeleteAccountProductsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountProductsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<Product> delRes = test(delReq, caller);
	
		// GET
	
		GetChannelProductsId getOp = ApiOperations.GetChannelProductsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetChannelProductsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Product> getRes = null;
	
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
	
		ProductTest test = new ProductTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
