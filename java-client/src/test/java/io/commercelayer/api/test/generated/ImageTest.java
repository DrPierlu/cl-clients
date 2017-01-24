package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Image;
import io.commercelayer.api.operation.DeleteAccountImagesId;
import io.commercelayer.api.operation.GetAccountImagesId;
import io.commercelayer.api.operation.PostAccountImages;
import io.commercelayer.api.operation.PutAccountImagesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ImageTest
 */
public class ImageTest extends IntegrationTest<Image> {

	@Override
	public ApiResponse<Image> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountImages postOp = ApiOperations.PostAccountImages();
	
		Image res = new Image();
	
		// FIELD NOT FOUND -> res.setAttachment("attachment");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountImages> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Image> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getAttachment());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Image> crudReadTest(Image res, ApiCaller caller) {
	
		// GET
	
		GetAccountImagesId getOp = ApiOperations.GetAccountImagesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountImagesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Image> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Image> crudUpdateTest(Image oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountImagesId putOp = ApiOperations.PutAccountImagesId();
		putOp.setId(oldRes.getId());
	
		Image res = new Image();
	
		// FIELD NOT FOUND -> res.setAttachment(randomField(oldRes.getAttachment()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountImagesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Image> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getAttachment(), putRes.getResource().getAttachment());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<Image> crudDeleteTest(Image res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountImagesId delOp = ApiOperations.DeleteAccountImagesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountImagesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<Image> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountImagesId getOp = ApiOperations.GetAccountImagesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountImagesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Image> getRes = null;
	
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
	
		ImageTest test = new ImageTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
