package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Taxon;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * TaxonTest
 */
public class TaxonTest extends IntegrationTest<Taxon> {

	@Override
	public ApiResponse<Taxon> testCreate(ApiCaller caller) {
		throw new TestException("TaxonTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<Taxon> testRead(Taxon res, ApiCaller caller) {
		throw new TestException("TaxonTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<Taxon> testUpdate(Taxon oldRes, ApiCaller caller) {
		throw new TestException("TaxonTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<Taxon> testDelete(Taxon res, ApiCaller caller) {
		throw new TestException("TaxonTest.testDelete not implemented");
	}
	

	public static void main(String[] args) {
	
		TaxonTest test = new TaxonTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
