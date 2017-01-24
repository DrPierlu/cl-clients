package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Language;
import io.commercelayer.api.operation.DeleteAccountLanguagesId;
import io.commercelayer.api.operation.GetAccountLanguagesId;
import io.commercelayer.api.operation.PostAccountLanguages;
import io.commercelayer.api.operation.PutAccountLanguagesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * LanguageTest
 */
public class LanguageTest extends IntegrationTest<Language> {

	@Override
	public ApiResponse<Language> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountLanguages postOp = ApiOperations.PostAccountLanguages();
	
		Language res = new Language();
	
		res.setCode("code");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountLanguages> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Language> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getCode());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Language> crudReadTest(Language res, ApiCaller caller) {
	
		// GET
	
		GetAccountLanguagesId getOp = ApiOperations.GetAccountLanguagesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountLanguagesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Language> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Language> crudUpdateTest(Language oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountLanguagesId putOp = ApiOperations.PutAccountLanguagesId();
		putOp.setId(oldRes.getId());
	
		Language res = new Language();
	
		res.setCode(randomField(oldRes.getCode()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountLanguagesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Language> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getCode(), putRes.getResource().getCode());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<Language> crudDeleteTest(Language res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountLanguagesId delOp = ApiOperations.DeleteAccountLanguagesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountLanguagesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<Language> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountLanguagesId getOp = ApiOperations.GetAccountLanguagesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountLanguagesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Language> getRes = null;
	
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
	
		LanguageTest test = new LanguageTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
