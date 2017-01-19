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
	public ApiResponse<WireTransfer> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<WireTransfer> testRead(WireTransfer res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<WireTransfer> testUpdate(WireTransfer oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<WireTransfer> testDelete(WireTransfer res, ApiCaller caller) {
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
