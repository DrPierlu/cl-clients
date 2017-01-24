package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.OptionValue;
import io.commercelayer.api.operation.DeleteAccountOptionValuesId;
import io.commercelayer.api.operation.GetAccountOptionValuesId;
import io.commercelayer.api.operation.PostAccountOptionValues;
import io.commercelayer.api.operation.PutAccountOptionValuesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * OptionValueTest
 */
public class OptionValueTest extends IntegrationTest<OptionValue> {

	@Override
	public ApiResponse<OptionValue> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountOptionValues postOp = ApiOperations.PostAccountOptionValues();
	
		OptionValue res = new OptionValue();
	
		// FIELD NOT FOUND -> res.setOptionTypeId("optionTypeId");
		res.setName("name");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountOptionValues> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<OptionValue> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getOptionTypeId());
		Assert.assertNotNull(postRes.getResource().getName());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<OptionValue> crudReadTest(OptionValue res, ApiCaller caller) {
	
		// GET
	
		GetAccountOptionValuesId getOp = ApiOperations.GetAccountOptionValuesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountOptionValuesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<OptionValue> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<OptionValue> crudUpdateTest(OptionValue oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountOptionValuesId putOp = ApiOperations.PutAccountOptionValuesId();
		putOp.setId(oldRes.getId());
	
		OptionValue res = new OptionValue();
	
		// FIELD NOT FOUND -> res.setOptionTypeId(randomField(oldRes.getOptionTypeId()));
		res.setName(randomField(oldRes.getName()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountOptionValuesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<OptionValue> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getOptionTypeId(), putRes.getResource().getOptionTypeId());
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<OptionValue> crudDeleteTest(OptionValue res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountOptionValuesId delOp = ApiOperations.DeleteAccountOptionValuesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountOptionValuesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<OptionValue> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountOptionValuesId getOp = ApiOperations.GetAccountOptionValuesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountOptionValuesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<OptionValue> getRes = null;
	
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
	
		OptionValueTest test = new OptionValueTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
