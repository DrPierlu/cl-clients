package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Channel;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * ChannelTest
 */
public class ChannelTest extends IntegrationTest<Channel> {

	@Override
	public ApiResponse<Channel> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Channel> crudReadTest(Channel res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Channel> crudUpdateTest(Channel oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Channel> crudDeleteTest(Channel res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		ChannelTest test = new ChannelTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
