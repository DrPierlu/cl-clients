package io.commercelayer.api.test.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.common.ApiResource;

public abstract class IntegrationTest<T extends ApiResource> extends ApiTest<T> {
	
	protected Properties testData;
	
	public void runTest() {
		integrationTest();
	}
	
	public void initTest() {
	
		testData = new Properties();
		
		String testName = getClass().getSimpleName();
		String dataFile = String.format("data/%s.properties", testName);
		
		try(InputStream is = IntegrationTest.class.getResourceAsStream(dataFile)) {
			if (is != null) {
				logger.info("Loading test data from file {} ...", dataFile);
				testData.load(is);
				if (testData.size() == 0) {
					logger.warn("No test data found for {}", testName);
					testData = null;
				}
			}
			
		}
		catch (IOException ioe) {
			logger.error("Error reading test data file {}", dataFile);
			testData = null;
		}
		
	}
	
	private String getTestData(String crudOp, String fieldName) {
		if (this.testData == null) return null;
		return this.testData.getProperty(String.format("crud.%s.resource.field.%s", crudOp, fieldName));
	}
	
	protected String getCreateTestData(String fieldName) {
		return getTestData("create", fieldName);
		
	}
	
	protected String getReadTestData(String fieldName) {
		return getTestData("read", fieldName);
	}
	
	protected String getUpdateTestData(String fieldName) {
		return getTestData("update", fieldName);
	}
	
	protected String getDeleteTestData(String fieldName) {
		return getTestData("delete", fieldName);
	}

	private void integrationTest() {
		
		ApiCaller caller = getApiCaller();
		
		ApiResponse<T> insRes = crudCreateTest(caller);
		
		ApiResponse<T> getRes = crudReadTest(insRes.getResource(), caller);
		
		ApiResponse<T> updRes = crudUpdateTest(getRes.getResource(), caller);
		
		@SuppressWarnings("unused")
		ApiResponse<T> delRes = crudDeleteTest(updRes.getResource(), caller);
		
	}
	
	protected abstract ApiResponse<T> crudCreateTest(ApiCaller caller);
	
	protected abstract ApiResponse<T> crudReadTest(T res, ApiCaller caller);
	
	protected abstract ApiResponse<T> crudUpdateTest(T oldRes, ApiCaller caller);
	
	protected abstract ApiResponse<T> crudDeleteTest(T res, ApiCaller caller);
	
}
