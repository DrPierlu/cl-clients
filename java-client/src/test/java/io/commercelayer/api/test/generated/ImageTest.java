package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Image;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * ImageTest
 */
public class ImageTest extends IntegrationTest<Image> {

	@Override
	public ApiResponse<Image> testCreate(ApiCaller caller) {
		throw new TestException("ImageTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<Image> testRead(Image res, ApiCaller caller) {
		throw new TestException("ImageTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<Image> testUpdate(Image oldRes, ApiCaller caller) {
		throw new TestException("ImageTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<Image> testDelete(Image res, ApiCaller caller) {
		throw new TestException("ImageTest.testDelete not implemented");
	}
	

	public static void main(String[] args) {
	
		ImageTest test = new ImageTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
