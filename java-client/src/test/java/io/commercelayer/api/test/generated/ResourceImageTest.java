package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ResourceImage;
import io.commercelayer.api.operation.DeleteAccountResourceImagesId;
import io.commercelayer.api.operation.GetAccountResourceImagesId;
import io.commercelayer.api.operation.PostAccountResourceImages;
import io.commercelayer.api.operation.PutAccountResourceImagesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ResourceImageTest
 */
public class ResourceImageTest extends IntegrationTest<ResourceImage> {

	@Override
	public ApiResponse<ResourceImage> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountResourceImages postOp = ApiOperations.PostAccountResourceImages();
	
		ResourceImage res = new ResourceImage();
	
		// FIELD NOT FOUND -> res.setImageId("imageId");
		// FIELD NOT FOUND -> res.setImageableResource("imageableResource");
		// FIELD NOT FOUND -> res.setImageableId("imageableId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountResourceImages> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<ResourceImage> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getImageId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getImageableResource());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getImageableId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<ResourceImage> crudReadTest(ResourceImage res, ApiCaller caller) {
	
		// GET
	
		GetAccountResourceImagesId getOp = ApiOperations.GetAccountResourceImagesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountResourceImagesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ResourceImage> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<ResourceImage> crudUpdateTest(ResourceImage oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountResourceImagesId putOp = ApiOperations.PutAccountResourceImagesId();
		putOp.setId(oldRes.getId());
	
		ResourceImage res = new ResourceImage();
	
		// FIELD NOT FOUND -> res.setImageId(randomField(oldRes.getImageId()));
		// FIELD NOT FOUND -> res.setImageableResource(randomField(oldRes.getImageableResource()));
		// FIELD NOT FOUND -> res.setImageableId(randomField(oldRes.getImageableId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountResourceImagesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<ResourceImage> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getImageId(), putRes.getResource().getImageId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getImageableResource(), putRes.getResource().getImageableResource());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getImageableId(), putRes.getResource().getImageableId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<ResourceImage> crudDeleteTest(ResourceImage res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountResourceImagesId delOp = ApiOperations.DeleteAccountResourceImagesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountResourceImagesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<ResourceImage> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountResourceImagesId getOp = ApiOperations.GetAccountResourceImagesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountResourceImagesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ResourceImage> getRes = null;
	
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
	
		ResourceImageTest test = new ResourceImageTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
