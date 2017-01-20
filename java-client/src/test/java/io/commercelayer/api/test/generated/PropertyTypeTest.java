package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.PropertyType;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * PropertyTypeTest
 */
public class PropertyTypeTest extends IntegrationTest<PropertyType> {

	@Override
	public ApiResponse<PropertyType> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<PropertyType> crudReadTest(PropertyType res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<PropertyType> crudUpdateTest(PropertyType oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<PropertyType> crudDeleteTest(PropertyType res, ApiCaller caller) {
		return null;
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
