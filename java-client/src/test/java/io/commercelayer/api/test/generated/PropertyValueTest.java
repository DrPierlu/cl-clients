package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.PropertyValue;
import io.commercelayer.api.operation.DeleteAccountPropertyValuesId;
import io.commercelayer.api.operation.GetAccountPropertyValuesId;
import io.commercelayer.api.operation.PostAccountPropertyValues;
import io.commercelayer.api.operation.PutAccountPropertyValuesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * PropertyValueTest
 */
public class PropertyValueTest extends IntegrationTest<PropertyValue> {

	@Override
	public ApiResponse<PropertyValue> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountPropertyValues postOp = ApiOperations.PostAccountPropertyValues();
	
		PropertyValue res = new PropertyValue();
	
		// FIELD NOT FOUND -> res.setPropertyTypeId("propertyTypeId");
		res.setName("name");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountPropertyValues> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<PropertyValue> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPropertyTypeId());
		Assert.assertNotNull(postRes.getResource().getName());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<PropertyValue> crudReadTest(PropertyValue res, ApiCaller caller) {
	
		// GET
	
		GetAccountPropertyValuesId getOp = ApiOperations.GetAccountPropertyValuesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountPropertyValuesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<PropertyValue> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<PropertyValue> crudUpdateTest(PropertyValue oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountPropertyValuesId putOp = ApiOperations.PutAccountPropertyValuesId();
		putOp.setId(oldRes.getId());
	
		PropertyValue res = new PropertyValue();
	
		// FIELD NOT FOUND -> res.setPropertyTypeId(randomField(oldRes.getPropertyTypeId()));
		res.setName(randomField(oldRes.getName()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountPropertyValuesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<PropertyValue> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPropertyTypeId(), putRes.getResource().getPropertyTypeId());
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<PropertyValue> crudDeleteTest(PropertyValue res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountPropertyValuesId delOp = ApiOperations.DeleteAccountPropertyValuesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountPropertyValuesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<PropertyValue> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountPropertyValuesId getOp = ApiOperations.GetAccountPropertyValuesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountPropertyValuesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<PropertyValue> getRes = null;
	
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
	
		PropertyValueTest test = new PropertyValueTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
