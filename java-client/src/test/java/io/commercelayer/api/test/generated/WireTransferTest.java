package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.WireTransfer;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * WireTransferTest
 */
public class WireTransferTest extends IntegrationTest<WireTransfer> {

	@Override
	public ApiResponse<WireTransfer> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<WireTransfer> crudReadTest(WireTransfer res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<WireTransfer> crudUpdateTest(WireTransfer oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<WireTransfer> crudDeleteTest(WireTransfer res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		WireTransferTest test = new WireTransferTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
