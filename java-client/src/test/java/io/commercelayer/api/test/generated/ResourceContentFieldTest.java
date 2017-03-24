package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ResourceContentField;
import io.commercelayer.api.operation.DeleteAccountResourceContentFieldsId;
import io.commercelayer.api.operation.GetAccountResourceContentFieldsId;
import io.commercelayer.api.operation.PostAccountResourceContentFields;
import io.commercelayer.api.operation.PutAccountResourceContentFieldsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ResourceContentFieldTest
 */
public class ResourceContentFieldTest extends IntegrationTest<ResourceContentField> {

	@Override
	public ApiResponse<ResourceContentField> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountResourceContentFields postOp = ApiOperations.PostAccountResourceContentFields();
	
		ResourceContentField res = new ResourceContentField();
	
		// FIELD NOT FOUND -> res.setExtensibleResource("extensibleResource");
		// FIELD NOT FOUND -> res.setExtensibleId("extensibleId");
		// FIELD NOT FOUND -> res.setContentFieldId("contentFieldId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountResourceContentFields> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<ResourceContentField> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getExtensibleResource());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getExtensibleId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getContentFieldId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<ResourceContentField> crudReadTest(ResourceContentField res, ApiCaller caller) {
	
		// GET
	
		GetAccountResourceContentFieldsId getOp = ApiOperations.GetAccountResourceContentFieldsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountResourceContentFieldsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ResourceContentField> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<ResourceContentField> crudUpdateTest(ResourceContentField oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountResourceContentFieldsId putOp = ApiOperations.PutAccountResourceContentFieldsId();
		putOp.setId(oldRes.getId());
	
		ResourceContentField res = new ResourceContentField();
	
		// FIELD NOT FOUND -> res.setExtensibleResource(randomField(oldRes.getExtensibleResource()));
		// FIELD NOT FOUND -> res.setExtensibleId(randomField(oldRes.getExtensibleId()));
		// FIELD NOT FOUND -> res.setContentFieldId(randomField(oldRes.getContentFieldId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountResourceContentFieldsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<ResourceContentField> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getExtensibleResource(), putRes.getResource().getExtensibleResource());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getExtensibleId(), putRes.getResource().getExtensibleId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getContentFieldId(), putRes.getResource().getContentFieldId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<ResourceContentField> crudDeleteTest(ResourceContentField res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountResourceContentFieldsId delOp = ApiOperations.DeleteAccountResourceContentFieldsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountResourceContentFieldsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<ResourceContentField> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountResourceContentFieldsId getOp = ApiOperations.GetAccountResourceContentFieldsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountResourceContentFieldsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ResourceContentField> getRes = null;
	
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
	
		ResourceContentFieldTest test = new ResourceContentFieldTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
