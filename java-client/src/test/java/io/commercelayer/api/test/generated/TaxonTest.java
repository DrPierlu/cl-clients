package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Taxon;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * TaxonTest
 */
public class TaxonTest extends IntegrationTest<Taxon> {

	@Override
	public ApiResponse<Taxon> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Taxon> testRead(Taxon res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Taxon> testUpdate(Taxon oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Taxon> testDelete(Taxon res, ApiCaller caller) {
		return null;
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
