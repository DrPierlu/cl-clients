package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Channel;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * ChannelTest
 */
public class ChannelTest extends IntegrationTest<Channel> {

	@Override
	public ApiResponse<Channel> testCreate(ApiCaller caller) {
		throw new TestException("ChannelTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<Channel> testRead(Channel res, ApiCaller caller) {
		throw new TestException("ChannelTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<Channel> testUpdate(Channel oldRes, ApiCaller caller) {
		throw new TestException("ChannelTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<Channel> testDelete(Channel res, ApiCaller caller) {
		throw new TestException("ChannelTest.testDelete not implemented");
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
