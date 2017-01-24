package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.CreditCard;
import io.commercelayer.api.operation.DeleteAccountCreditCardsId;
import io.commercelayer.api.operation.GetAccountCreditCardsId;
import io.commercelayer.api.operation.PostAccountCreditCards;
import io.commercelayer.api.operation.PutAccountCreditCardsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * CreditCardTest
 */
public class CreditCardTest extends IntegrationTest<CreditCard> {

	@Override
	public ApiResponse<CreditCard> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountCreditCards postOp = ApiOperations.PostAccountCreditCards();
	
		CreditCard res = new CreditCard();
	
		// FIELD NOT FOUND -> res.setFirstName("firstName");
		// FIELD NOT FOUND -> res.setLastName("lastName");
		res.setNumber("number");
		// FIELD TYPE MISMATCH -> res.setMonth("month");
		// FIELD TYPE MISMATCH -> res.setYear("year");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountCreditCards> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<CreditCard> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getFirstName());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getLastName());
		Assert.assertNotNull(postRes.getResource().getNumber());
		// FIELD TYPE MISMATCH -> Assert.assertNotNull(postRes.getResource().getMonth());
		// FIELD TYPE MISMATCH -> Assert.assertNotNull(postRes.getResource().getYear());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<CreditCard> crudReadTest(CreditCard res, ApiCaller caller) {
	
		// GET
	
		GetAccountCreditCardsId getOp = ApiOperations.GetAccountCreditCardsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountCreditCardsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<CreditCard> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<CreditCard> crudUpdateTest(CreditCard oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountCreditCardsId putOp = ApiOperations.PutAccountCreditCardsId();
		putOp.setId(oldRes.getId());
	
		CreditCard res = new CreditCard();
	
		// FIELD NOT FOUND -> res.setFirstName(randomField(oldRes.getFirstName()));
		// FIELD NOT FOUND -> res.setLastName(randomField(oldRes.getLastName()));
		res.setNumber(randomField(oldRes.getNumber()));
		// FIELD TYPE MISMATCH -> res.setMonth(randomField(oldRes.getMonth()));
		// FIELD TYPE MISMATCH -> res.setYear(randomField(oldRes.getYear()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountCreditCardsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<CreditCard> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getFirstName(), putRes.getResource().getFirstName());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getLastName(), putRes.getResource().getLastName());
		Assert.assertNotEquals(oldRes.getNumber(), putRes.getResource().getNumber());
		// FIELD TYPE MISMATCH -> Assert.assertNotEquals(oldRes.getMonth(), putRes.getResource().getMonth());
		// FIELD TYPE MISMATCH -> Assert.assertNotEquals(oldRes.getYear(), putRes.getResource().getYear());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<CreditCard> crudDeleteTest(CreditCard res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountCreditCardsId delOp = ApiOperations.DeleteAccountCreditCardsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountCreditCardsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<CreditCard> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountCreditCardsId getOp = ApiOperations.GetAccountCreditCardsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountCreditCardsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<CreditCard> getRes = null;
	
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
	
		CreditCardTest test = new CreditCardTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
