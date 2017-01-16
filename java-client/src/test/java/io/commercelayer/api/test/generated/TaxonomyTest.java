package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Taxonomy;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * TaxonomyTest
 */
public class TaxonomyTest extends IntegrationTest<Taxonomy> {

	@Override
	public ApiResponse<Taxonomy> testCreate(ApiCaller caller) {
		throw new TestException("TaxonomyTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<Taxonomy> testRead(Taxonomy res, ApiCaller caller) {
		throw new TestException("TaxonomyTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<Taxonomy> testUpdate(Taxonomy oldRes, ApiCaller caller) {
		throw new TestException("TaxonomyTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<Taxonomy> testDelete(Taxonomy res, ApiCaller caller) {
		throw new TestException("TaxonomyTest.testDelete not implemented");
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
