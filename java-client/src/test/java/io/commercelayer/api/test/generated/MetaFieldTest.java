package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.MetaField;
import io.commercelayer.api.operation.DeleteAccountMetaFieldsId;
import io.commercelayer.api.operation.GetAccountMetaFieldsId;
import io.commercelayer.api.operation.PostAccountMetaFields;
import io.commercelayer.api.operation.PutAccountMetaFieldsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * MetaFieldTest
 */
public class MetaFieldTest extends IntegrationTest<MetaField> {

	@Override
	public ApiResponse<MetaField> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountMetaFields postOp = ApiOperations.PostAccountMetaFields();
	
		MetaField res = new MetaField();
	
		res.setNamespace("namespace");
		res.setName("name");
		res.setValue("value");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountMetaFields> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<MetaField> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getNamespace());
		Assert.assertNotNull(postRes.getResource().getName());
		Assert.assertNotNull(postRes.getResource().getValue());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<MetaField> crudReadTest(MetaField res, ApiCaller caller) {
	
		// GET
	
		GetAccountMetaFieldsId getOp = ApiOperations.GetAccountMetaFieldsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountMetaFieldsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<MetaField> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<MetaField> crudUpdateTest(MetaField oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountMetaFieldsId putOp = ApiOperations.PutAccountMetaFieldsId();
		putOp.setId(oldRes.getId());
	
		MetaField res = new MetaField();
	
		res.setNamespace(randomField(oldRes.getNamespace()));
		res.setName(randomField(oldRes.getName()));
		res.setValue(randomField(oldRes.getValue()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountMetaFieldsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<MetaField> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getNamespace(), putRes.getResource().getNamespace());
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
		Assert.assertNotEquals(oldRes.getValue(), putRes.getResource().getValue());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<MetaField> crudDeleteTest(MetaField res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountMetaFieldsId delOp = ApiOperations.DeleteAccountMetaFieldsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountMetaFieldsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<MetaField> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountMetaFieldsId getOp = ApiOperations.GetAccountMetaFieldsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountMetaFieldsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<MetaField> getRes = null;
	
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
	
		MetaFieldTest test = new MetaFieldTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
