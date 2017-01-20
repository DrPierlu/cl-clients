package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.PropertyValue;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * PropertyValueTest
 */
public class PropertyValueTest extends IntegrationTest<PropertyValue> {

	@Override
	public ApiResponse<PropertyValue> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<PropertyValue> crudReadTest(PropertyValue res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<PropertyValue> crudUpdateTest(PropertyValue oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<PropertyValue> crudDeleteTest(PropertyValue res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		PropertyValueTest test = new PropertyValueTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
