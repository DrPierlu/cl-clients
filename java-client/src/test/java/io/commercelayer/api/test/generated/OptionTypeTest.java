package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.OptionType;
import io.commercelayer.api.operation.DeleteAccountOptionTypesId;
import io.commercelayer.api.operation.GetAccountOptionTypesId;
import io.commercelayer.api.operation.PostAccountOptionTypes;
import io.commercelayer.api.operation.PutAccountOptionTypesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * OptionTypeTest
 */
public class OptionTypeTest extends IntegrationTest<OptionType> {

	@Override
	public ApiResponse<OptionType> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountOptionTypes postOp = ApiOperations.PostAccountOptionTypes();
	
		OptionType res = new OptionType();
	
		res.setName("name");
		// FIELD NOT FOUND -> res.setProductTypeId("productTypeId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountOptionTypes> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<OptionType> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getName());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getProductTypeId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<OptionType> crudReadTest(OptionType res, ApiCaller caller) {
	
		// GET
	
		GetAccountOptionTypesId getOp = ApiOperations.GetAccountOptionTypesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountOptionTypesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<OptionType> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<OptionType> crudUpdateTest(OptionType oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountOptionTypesId putOp = ApiOperations.PutAccountOptionTypesId();
		putOp.setId(oldRes.getId());
	
		OptionType res = new OptionType();
	
		res.setName(randomField(oldRes.getName()));
		// FIELD NOT FOUND -> res.setProductTypeId(randomField(oldRes.getProductTypeId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountOptionTypesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<OptionType> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getProductTypeId(), putRes.getResource().getProductTypeId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<OptionType> crudDeleteTest(OptionType res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountOptionTypesId delOp = ApiOperations.DeleteAccountOptionTypesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountOptionTypesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<OptionType> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountOptionTypesId getOp = ApiOperations.GetAccountOptionTypesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountOptionTypesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<OptionType> getRes = null;
	
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
	
		OptionTypeTest test = new OptionTypeTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
