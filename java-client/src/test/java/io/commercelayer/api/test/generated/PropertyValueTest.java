package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.PropertyValue;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * PropertyValueTest
 */
public class PropertyValueTest extends IntegrationTest<PropertyValue> {

	@Override
	public ApiResponse<PropertyValue> testCreate(ApiCaller caller) {
		throw new TestException("PropertyValueTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<PropertyValue> testRead(PropertyValue res, ApiCaller caller) {
		throw new TestException("PropertyValueTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<PropertyValue> testUpdate(PropertyValue oldRes, ApiCaller caller) {
		throw new TestException("PropertyValueTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<PropertyValue> testDelete(PropertyValue res, ApiCaller caller) {
		throw new TestException("PropertyValueTest.testDelete not implemented");
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
