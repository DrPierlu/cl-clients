package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Transaction;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * TransactionTest
 */
public class TransactionTest extends IntegrationTest<Transaction> {

	@Override
	public ApiResponse<Transaction> testCreate(ApiCaller caller) {
		throw new TestException("TransactionTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<Transaction> testRead(Transaction res, ApiCaller caller) {
		throw new TestException("TransactionTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<Transaction> testUpdate(Transaction oldRes, ApiCaller caller) {
		throw new TestException("TransactionTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<Transaction> testDelete(Transaction res, ApiCaller caller) {
		throw new TestException("TransactionTest.testDelete not implemented");
	}
	

	public static void main(String[] args) {
	
		TransactionTest test = new TransactionTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
