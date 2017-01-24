package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Variant;
import io.commercelayer.api.operation.DeleteAccountVariantsId;
import io.commercelayer.api.operation.GetAccountVariantsId;
import io.commercelayer.api.operation.PostAccountVariants;
import io.commercelayer.api.operation.PutAccountVariantsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * VariantTest
 */
public class VariantTest extends IntegrationTest<Variant> {

	@Override
	public ApiResponse<Variant> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountVariants postOp = ApiOperations.PostAccountVariants();
	
		Variant res = new Variant();
	
		// FIELD NOT FOUND -> res.setProductId("productId");
		res.setSku("sku");
		// FIELD NOT FOUND -> res.setTaxCode("taxCode");
		// FIELD NOT FOUND -> res.setTrackInventory("trackInventory");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountVariants> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Variant> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getProductId());
		Assert.assertNotNull(postRes.getResource().getSku());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getTaxCode());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getTrackInventory());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Variant> crudReadTest(Variant res, ApiCaller caller) {
	
		// GET
	
		GetAccountVariantsId getOp = ApiOperations.GetAccountVariantsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountVariantsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Variant> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Variant> crudUpdateTest(Variant oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountVariantsId putOp = ApiOperations.PutAccountVariantsId();
		putOp.setId(oldRes.getId());
	
		Variant res = new Variant();
	
		// FIELD NOT FOUND -> res.setProductId(randomField(oldRes.getProductId()));
		res.setSku(randomField(oldRes.getSku()));
		// FIELD NOT FOUND -> res.setTaxCode(randomField(oldRes.getTaxCode()));
		// FIELD NOT FOUND -> res.setTrackInventory(randomField(oldRes.getTrackInventory()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountVariantsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Variant> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getProductId(), putRes.getResource().getProductId());
		Assert.assertNotEquals(oldRes.getSku(), putRes.getResource().getSku());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getTaxCode(), putRes.getResource().getTaxCode());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getTrackInventory(), putRes.getResource().getTrackInventory());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<Variant> crudDeleteTest(Variant res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountVariantsId delOp = ApiOperations.DeleteAccountVariantsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountVariantsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<Variant> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountVariantsId getOp = ApiOperations.GetAccountVariantsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountVariantsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Variant> getRes = null;
	
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
	
		VariantTest test = new VariantTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
