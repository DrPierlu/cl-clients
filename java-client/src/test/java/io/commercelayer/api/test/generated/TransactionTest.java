package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Transaction;
import io.commercelayer.api.operation.DeleteAccountTransactionsId;
import io.commercelayer.api.operation.GetAccountTransactionsId;
import io.commercelayer.api.operation.PostAccountTransactions;
import io.commercelayer.api.operation.PutAccountTransactionsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * TransactionTest
 */
public class TransactionTest extends IntegrationTest<Transaction> {

	@Override
	public ApiResponse<Transaction> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountTransactions postOp = ApiOperations.PostAccountTransactions();
	
		Transaction res = new Transaction();
	
		/* No payload data */
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountTransactions> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Transaction> postRes = test(postReq, caller);
	
	
		/* No test assertions */
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Transaction> crudReadTest(Transaction res, ApiCaller caller) {
	
		// GET
	
		GetAccountTransactionsId getOp = ApiOperations.GetAccountTransactionsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountTransactionsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Transaction> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Transaction> crudUpdateTest(Transaction oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountTransactionsId putOp = ApiOperations.PutAccountTransactionsId();
		putOp.setId(oldRes.getId());
	
		Transaction res = new Transaction();
	
	
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountTransactionsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Transaction> putRes = test(putReq, caller);
	
	
	
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<Transaction> crudDeleteTest(Transaction res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountTransactionsId delOp = ApiOperations.DeleteAccountTransactionsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountTransactionsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<Transaction> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountTransactionsId getOp = ApiOperations.GetAccountTransactionsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountTransactionsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Transaction> getRes = null;
	
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
	
		TransactionTest test = new TransactionTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
