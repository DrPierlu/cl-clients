package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingCarrierAccount;
import io.commercelayer.api.operation.DeleteAccountShippingCarrierAccountsId;
import io.commercelayer.api.operation.GetAccountShippingCarrierAccountsId;
import io.commercelayer.api.operation.PostAccountShippingCarrierAccounts;
import io.commercelayer.api.operation.PutAccountShippingCarrierAccountsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ShippingCarrierAccountTest
 */
public class ShippingCarrierAccountTest extends IntegrationTest<ShippingCarrierAccount> {

	@Override
	public ApiResponse<ShippingCarrierAccount> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountShippingCarrierAccounts postOp = ApiOperations.PostAccountShippingCarrierAccounts();
	
		ShippingCarrierAccount res = new ShippingCarrierAccount();
	
		// FIELD NOT FOUND -> res.setShippingCarrierId("shippingCarrierId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountShippingCarrierAccounts> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<ShippingCarrierAccount> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShippingCarrierId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<ShippingCarrierAccount> crudReadTest(ShippingCarrierAccount res, ApiCaller caller) {
	
		// GET
	
		GetAccountShippingCarrierAccountsId getOp = ApiOperations.GetAccountShippingCarrierAccountsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountShippingCarrierAccountsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingCarrierAccount> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<ShippingCarrierAccount> crudUpdateTest(ShippingCarrierAccount oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountShippingCarrierAccountsId putOp = ApiOperations.PutAccountShippingCarrierAccountsId();
		putOp.setId(oldRes.getId());
	
		ShippingCarrierAccount res = new ShippingCarrierAccount();
	
		// FIELD NOT FOUND -> res.setShippingCarrierId(randomField(oldRes.getShippingCarrierId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountShippingCarrierAccountsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<ShippingCarrierAccount> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShippingCarrierId(), putRes.getResource().getShippingCarrierId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<ShippingCarrierAccount> crudDeleteTest(ShippingCarrierAccount res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountShippingCarrierAccountsId delOp = ApiOperations.DeleteAccountShippingCarrierAccountsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountShippingCarrierAccountsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<ShippingCarrierAccount> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountShippingCarrierAccountsId getOp = ApiOperations.GetAccountShippingCarrierAccountsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountShippingCarrierAccountsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<ShippingCarrierAccount> getRes = null;
	
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
	
		ShippingCarrierAccountTest test = new ShippingCarrierAccountTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
