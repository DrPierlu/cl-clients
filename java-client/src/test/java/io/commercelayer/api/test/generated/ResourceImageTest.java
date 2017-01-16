package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ResourceImage;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * ResourceImageTest
 */
public class ResourceImageTest extends IntegrationTest<ResourceImage> {

	@Override
	public ApiResponse<ResourceImage> testCreate(ApiCaller caller) {
		throw new TestException("ResourceImageTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<ResourceImage> testRead(ResourceImage res, ApiCaller caller) {
		throw new TestException("ResourceImageTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<ResourceImage> testUpdate(ResourceImage oldRes, ApiCaller caller) {
		throw new TestException("ResourceImageTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<ResourceImage> testDelete(ResourceImage res, ApiCaller caller) {
		throw new TestException("ResourceImageTest.testDelete not implemented");
	}
	

	public static void main(String[] args) {
	
		ResourceImageTest test = new ResourceImageTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
