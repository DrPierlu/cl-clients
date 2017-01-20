package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Taxonomy;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * TaxonomyTest
 */
public class TaxonomyTest extends IntegrationTest<Taxonomy> {

	@Override
	public ApiResponse<Taxonomy> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Taxonomy> crudReadTest(Taxonomy res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Taxonomy> crudUpdateTest(Taxonomy oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Taxonomy> crudDeleteTest(Taxonomy res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		TaxonomyTest test = new TaxonomyTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
