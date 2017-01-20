package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ResourceImage;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * ResourceImageTest
 */
public class ResourceImageTest extends IntegrationTest<ResourceImage> {

	@Override
	public ApiResponse<ResourceImage> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ResourceImage> crudReadTest(ResourceImage res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ResourceImage> crudUpdateTest(ResourceImage oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ResourceImage> crudDeleteTest(ResourceImage res, ApiCaller caller) {
		return null;
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
