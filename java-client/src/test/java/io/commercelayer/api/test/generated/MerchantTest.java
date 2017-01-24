package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Merchant;
import io.commercelayer.api.operation.DeleteAccountMerchantsId;
import io.commercelayer.api.operation.GetAccountMerchantsId;
import io.commercelayer.api.operation.PostAccountMerchants;
import io.commercelayer.api.operation.PutAccountMerchantsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * MerchantTest
 */
public class MerchantTest extends IntegrationTest<Merchant> {

	@Override
	public ApiResponse<Merchant> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountMerchants postOp = ApiOperations.PostAccountMerchants();
	
		Merchant res = new Merchant();
	
		res.setName("name");
		res.setDescription("description");
		// FIELD NOT FOUND -> res.setAddressId("addressId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountMerchants> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Merchant> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getName());
		Assert.assertNotNull(postRes.getResource().getDescription());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getAddressId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Merchant> crudReadTest(Merchant res, ApiCaller caller) {
	
		// GET
	
		GetAccountMerchantsId getOp = ApiOperations.GetAccountMerchantsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountMerchantsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Merchant> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Merchant> crudUpdateTest(Merchant oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountMerchantsId putOp = ApiOperations.PutAccountMerchantsId();
		putOp.setId(oldRes.getId());
	
		Merchant res = new Merchant();
	
		res.setName(randomField(oldRes.getName()));
		res.setDescription(randomField(oldRes.getDescription()));
		// FIELD NOT FOUND -> res.setAddressId(randomField(oldRes.getAddressId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountMerchantsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Merchant> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
		Assert.assertNotEquals(oldRes.getDescription(), putRes.getResource().getDescription());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getAddressId(), putRes.getResource().getAddressId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<Merchant> crudDeleteTest(Merchant res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountMerchantsId delOp = ApiOperations.DeleteAccountMerchantsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountMerchantsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<Merchant> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountMerchantsId getOp = ApiOperations.GetAccountMerchantsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountMerchantsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Merchant> getRes = null;
	
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
	
		MerchantTest test = new MerchantTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
