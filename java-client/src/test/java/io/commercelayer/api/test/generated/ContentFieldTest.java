package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ContentField;
import io.commercelayer.api.operation.DeleteAccountContentFieldsId;
import io.commercelayer.api.operation.GetAccountContentFieldsId;
import io.commercelayer.api.operation.PostAccountContentFields;
import io.commercelayer.api.operation.PutAccountContentFieldsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ContentFieldTest
 */
public class ContentFieldTest extends IntegrationTest<ContentField> {

	@Override
	public ApiResponse<ContentField> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountContentFields postOp = ApiOperations.PostAccountContentFields();
	
		ContentField res = new ContentField();
	
		res.setKind("kind");
		res.setName("name");
		res.setContent("content");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountContentFields> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<ContentField> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getKind());
		Assert.assertNotNull(postRes.getResource().getName());
		Assert.assertNotNull(postRes.getResource().getContent());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<ContentField> crudReadTest(ContentField res, ApiCaller caller) {
	
		// GET
	
		GetAccountContentFieldsId getOp = ApiOperations.GetAccountContentFieldsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountContentFieldsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ContentField> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<ContentField> crudUpdateTest(ContentField oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountContentFieldsId putOp = ApiOperations.PutAccountContentFieldsId();
		putOp.setId(oldRes.getId());
	
		ContentField res = new ContentField();
	
		res.setKind(randomField(oldRes.getKind()));
		res.setName(randomField(oldRes.getName()));
		res.setContent(randomField(oldRes.getContent()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountContentFieldsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<ContentField> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getKind(), putRes.getResource().getKind());
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
		Assert.assertNotEquals(oldRes.getContent(), putRes.getResource().getContent());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<ContentField> crudDeleteTest(ContentField res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountContentFieldsId delOp = ApiOperations.DeleteAccountContentFieldsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountContentFieldsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<ContentField> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountContentFieldsId getOp = ApiOperations.GetAccountContentFieldsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountContentFieldsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ContentField> getRes = null;
	
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
	
		ContentFieldTest test = new ContentFieldTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
