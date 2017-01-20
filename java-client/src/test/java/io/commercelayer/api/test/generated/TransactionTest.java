package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Transaction;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * TransactionTest
 */
public class TransactionTest extends IntegrationTest<Transaction> {

	@Override
	public ApiResponse<Transaction> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Transaction> crudReadTest(Transaction res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Transaction> crudUpdateTest(Transaction oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Transaction> crudDeleteTest(Transaction res, ApiCaller caller) {
		return null;
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
