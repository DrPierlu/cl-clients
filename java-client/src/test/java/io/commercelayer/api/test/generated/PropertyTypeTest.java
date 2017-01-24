package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.PropertyType;
import io.commercelayer.api.operation.DeleteAccountPropertyTypesId;
import io.commercelayer.api.operation.GetAccountPropertyTypesId;
import io.commercelayer.api.operation.PostAccountPropertyTypes;
import io.commercelayer.api.operation.PutAccountPropertyTypesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * PropertyTypeTest
 */
public class PropertyTypeTest extends IntegrationTest<PropertyType> {

	@Override
	public ApiResponse<PropertyType> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountPropertyTypes postOp = ApiOperations.PostAccountPropertyTypes();
	
		PropertyType res = new PropertyType();
	
		res.setName("name");
		// FIELD NOT FOUND -> res.setProductTypeId("productTypeId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountPropertyTypes> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<PropertyType> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getName());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getProductTypeId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<PropertyType> crudReadTest(PropertyType res, ApiCaller caller) {
	
		// GET
	
		GetAccountPropertyTypesId getOp = ApiOperations.GetAccountPropertyTypesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountPropertyTypesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<PropertyType> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<PropertyType> crudUpdateTest(PropertyType oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountPropertyTypesId putOp = ApiOperations.PutAccountPropertyTypesId();
		putOp.setId(oldRes.getId());
	
		PropertyType res = new PropertyType();
	
		res.setName(randomField(oldRes.getName()));
		// FIELD NOT FOUND -> res.setProductTypeId(randomField(oldRes.getProductTypeId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountPropertyTypesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<PropertyType> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getProductTypeId(), putRes.getResource().getProductTypeId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<PropertyType> crudDeleteTest(PropertyType res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountPropertyTypesId delOp = ApiOperations.DeleteAccountPropertyTypesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountPropertyTypesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<PropertyType> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountPropertyTypesId getOp = ApiOperations.GetAccountPropertyTypesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountPropertyTypesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<PropertyType> getRes = null;
	
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
	
		PropertyTypeTest test = new PropertyTypeTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
