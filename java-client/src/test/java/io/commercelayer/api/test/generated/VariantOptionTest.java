package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.VariantOption;
import io.commercelayer.api.operation.DeleteAccountVariantOptionsId;
import io.commercelayer.api.operation.GetAccountVariantOptionsId;
import io.commercelayer.api.operation.PostAccountVariantOptions;
import io.commercelayer.api.operation.PutAccountVariantOptionsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * VariantOptionTest
 */
public class VariantOptionTest extends IntegrationTest<VariantOption> {

	@Override
	public ApiResponse<VariantOption> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountVariantOptions postOp = ApiOperations.PostAccountVariantOptions();
	
		VariantOption res = new VariantOption();
	
		// FIELD NOT FOUND -> res.setVariantId("variantId");
		// FIELD NOT FOUND -> res.setOptionValueId("optionValueId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountVariantOptions> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<VariantOption> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getVariantId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getOptionValueId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<VariantOption> crudReadTest(VariantOption res, ApiCaller caller) {
	
		// GET
	
		GetAccountVariantOptionsId getOp = ApiOperations.GetAccountVariantOptionsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountVariantOptionsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<VariantOption> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<VariantOption> crudUpdateTest(VariantOption oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountVariantOptionsId putOp = ApiOperations.PutAccountVariantOptionsId();
		putOp.setId(oldRes.getId());
	
		VariantOption res = new VariantOption();
	
		// FIELD NOT FOUND -> res.setVariantId(randomField(oldRes.getVariantId()));
		// FIELD NOT FOUND -> res.setOptionValueId(randomField(oldRes.getOptionValueId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountVariantOptionsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<VariantOption> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getVariantId(), putRes.getResource().getVariantId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getOptionValueId(), putRes.getResource().getOptionValueId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<VariantOption> crudDeleteTest(VariantOption res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountVariantOptionsId delOp = ApiOperations.DeleteAccountVariantOptionsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountVariantOptionsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<VariantOption> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountVariantOptionsId getOp = ApiOperations.GetAccountVariantOptionsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountVariantOptionsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<VariantOption> getRes = null;
	
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
	
		VariantOptionTest test = new VariantOptionTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
