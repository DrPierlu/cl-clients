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
	public ApiResponse<ResourceImage> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ResourceImage> testRead(ResourceImage res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ResourceImage> testUpdate(ResourceImage oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ResourceImage> testDelete(ResourceImage res, ApiCaller caller) {
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
