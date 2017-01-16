package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.PropertyType;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * PropertyTypeTest
 */
public class PropertyTypeTest extends IntegrationTest<PropertyType> {

	@Override
	public ApiResponse<PropertyType> testCreate(ApiCaller caller) {
		throw new TestException("PropertyTypeTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<PropertyType> testRead(PropertyType res, ApiCaller caller) {
		throw new TestException("PropertyTypeTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<PropertyType> testUpdate(PropertyType oldRes, ApiCaller caller) {
		throw new TestException("PropertyTypeTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<PropertyType> testDelete(PropertyType res, ApiCaller caller) {
		throw new TestException("PropertyTypeTest.testDelete not implemented");
	}
	

	public static void main(String[] args) {
	
		PropertyTypeTest test = new PropertyTypeTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
