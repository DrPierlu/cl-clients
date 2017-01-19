package io.commercelayer.api.test.integration;

import org.junit.Assert;

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

/**
 * CreditCardTest
 */
public class CreditCardTest extends IntegrationTest<CreditCard> {

	@Override
	public ApiResponse<CreditCard> testCreate(ApiCaller caller) {

		// POST

		PostAccountCreditCards postOp = ApiOperations.PostAccountCreditCards();

		CreditCard a = new CreditCard();

		a.setName(randomField("CreditCard"));
		a.setFirstName(randomField("firstName"));
		a.setLastName(randomField("lastName"));

		postOp.setPayload(a);

		ApiRequest<PostAccountCreditCards> postReq = new ApiRequest<>(postOp);
		
		ApiResponse<CreditCard> postRes = test(postReq, CreditCard.class, caller);

		Assert.assertNotNull(postRes.getResource().getId());

		return postRes;

	}


	@Override
	public ApiResponse<CreditCard> testRead(CreditCard res, ApiCaller caller) {

		// GET

		GetAccountCreditCardsId getOp = ApiOperations.GetAccountCreditCardsId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountCreditCardsId> getReq = new ApiRequest<>(getOp);
		
		ApiResponse<CreditCard> getRes = test(getReq, CreditCard.class, caller);

		Assert.assertNotNull(getRes.getResource().getName());

		return getRes;

	}


	@Override
	public ApiResponse<CreditCard> testUpdate(CreditCard oldRes, ApiCaller caller) {

		// PUT

		PutAccountCreditCardsId putOp = ApiOperations.PutAccountCreditCardsId();
		putOp.setId(oldRes.getId());

		CreditCard a = new CreditCard();

		a.setName(randomField(oldRes.getName()));
		a.setFirstName(randomField(oldRes.getFirstName()));
		a.setLastName(randomField(oldRes.getLastName()));

		putOp.setPayload(a);

		ApiRequest<PutAccountCreditCardsId> putReq = new ApiRequest<>(putOp);
		
		ApiResponse<CreditCard> putRes = test(putReq, CreditCard.class, caller);

		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
		Assert.assertNotEquals(oldRes.getFirstName(), putRes.getResource().getFirstName());
		Assert.assertNotEquals(oldRes.getLastName(), putRes.getResource().getLastName());

		return putRes;

	}


	@Override
	public ApiResponse<CreditCard> testDelete(CreditCard res, ApiCaller caller) {

		// DELETE

		DeleteAccountCreditCardsId delOp = ApiOperations.DeleteAccountCreditCardsId();
		delOp.setId(res.getId());

		ApiRequest<DeleteAccountCreditCardsId> delReq = new ApiRequest<>(delOp);

		ApiResponse<CreditCard> delRes = test(delReq, caller);

		// GET

		GetAccountCreditCardsId getOp = ApiOperations.GetAccountCreditCardsId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountCreditCardsId> getReq = new ApiRequest<>(getOp);

		ApiResponse<CreditCard> getRes = test(getReq, CreditCard.class, caller, false);

		Assert.assertNull(getRes.getResource());

		return delRes;

	}


	public static void main(String[] args) {

		CreditCardTest test = new CreditCardTest();

		test.runTest();

		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();

	}

}
