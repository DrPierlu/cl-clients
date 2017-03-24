package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ResourceMetaField;
import io.commercelayer.api.operation.DeleteAccountResourceMetaFieldsId;
import io.commercelayer.api.operation.GetAccountResourceMetaFieldsId;
import io.commercelayer.api.operation.PostAccountResourceMetaFields;
import io.commercelayer.api.operation.PutAccountResourceMetaFieldsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ResourceMetaFieldTest
 */
public class ResourceMetaFieldTest extends IntegrationTest<ResourceMetaField> {

	@Override
	public ApiResponse<ResourceMetaField> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountResourceMetaFields postOp = ApiOperations.PostAccountResourceMetaFields();
	
		ResourceMetaField res = new ResourceMetaField();
	
		// FIELD NOT FOUND -> res.setMetaFieldId("metaFieldId");
		// FIELD NOT FOUND -> res.setExtensibleResource("extensibleResource");
		// FIELD NOT FOUND -> res.setExtensibleId("extensibleId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountResourceMetaFields> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<ResourceMetaField> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getMetaFieldId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getExtensibleResource());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getExtensibleId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<ResourceMetaField> crudReadTest(ResourceMetaField res, ApiCaller caller) {
	
		// GET
	
		GetAccountResourceMetaFieldsId getOp = ApiOperations.GetAccountResourceMetaFieldsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountResourceMetaFieldsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ResourceMetaField> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<ResourceMetaField> crudUpdateTest(ResourceMetaField oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountResourceMetaFieldsId putOp = ApiOperations.PutAccountResourceMetaFieldsId();
		putOp.setId(oldRes.getId());
	
		ResourceMetaField res = new ResourceMetaField();
	
		// FIELD NOT FOUND -> res.setMetaFieldId(randomField(oldRes.getMetaFieldId()));
		// FIELD NOT FOUND -> res.setExtensibleResource(randomField(oldRes.getExtensibleResource()));
		// FIELD NOT FOUND -> res.setExtensibleId(randomField(oldRes.getExtensibleId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountResourceMetaFieldsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<ResourceMetaField> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getMetaFieldId(), putRes.getResource().getMetaFieldId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getExtensibleResource(), putRes.getResource().getExtensibleResource());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getExtensibleId(), putRes.getResource().getExtensibleId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<ResourceMetaField> crudDeleteTest(ResourceMetaField res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountResourceMetaFieldsId delOp = ApiOperations.DeleteAccountResourceMetaFieldsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountResourceMetaFieldsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<ResourceMetaField> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountResourceMetaFieldsId getOp = ApiOperations.GetAccountResourceMetaFieldsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountResourceMetaFieldsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ResourceMetaField> getRes = null;
	
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
	
		ResourceMetaFieldTest test = new ResourceMetaFieldTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
