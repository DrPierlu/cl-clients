package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Taxon;
import io.commercelayer.api.operation.DeleteAccountTaxonsId;
import io.commercelayer.api.operation.GetAccountTaxonsId;
import io.commercelayer.api.operation.PostAccountTaxons;
import io.commercelayer.api.operation.PutAccountTaxonsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * TaxonTest
 */
public class TaxonTest extends IntegrationTest<Taxon> {

	@Override
	public ApiResponse<Taxon> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountTaxons postOp = ApiOperations.PostAccountTaxons();
	
		Taxon res = new Taxon();
	
		// FIELD NOT FOUND -> res.setTaxonomyId("taxonomyId");
		res.setName("name");
		// FIELD NOT FOUND -> res.setParentId("parentId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountTaxons> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Taxon> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getTaxonomyId());
		Assert.assertNotNull(postRes.getResource().getName());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getParentId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Taxon> crudReadTest(Taxon res, ApiCaller caller) {
	
		// GET
	
		GetAccountTaxonsId getOp = ApiOperations.GetAccountTaxonsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountTaxonsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Taxon> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Taxon> crudUpdateTest(Taxon oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountTaxonsId putOp = ApiOperations.PutAccountTaxonsId();
		putOp.setId(oldRes.getId());
	
		Taxon res = new Taxon();
	
		// FIELD NOT FOUND -> res.setTaxonomyId(randomField(oldRes.getTaxonomyId()));
		res.setName(randomField(oldRes.getName()));
		// FIELD NOT FOUND -> res.setParentId(randomField(oldRes.getParentId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountTaxonsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Taxon> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getTaxonomyId(), putRes.getResource().getTaxonomyId());
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getParentId(), putRes.getResource().getParentId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<Taxon> crudDeleteTest(Taxon res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountTaxonsId delOp = ApiOperations.DeleteAccountTaxonsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountTaxonsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<Taxon> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountTaxonsId getOp = ApiOperations.GetAccountTaxonsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountTaxonsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Taxon> getRes = null;
	
		try {
			getRes = test(getReq, caller, false);
		}
		catch (TestException te) {
			if (te.causedByApiError()) {
				Assert.assertTrue(te.getError().getHttpErrorCode() == 404);
				Assert.assertNull(getRes);
			}
			else throw te;
		}
	
	
		return delRes;
	
	}
	

	public static void main(String[] args) {
	
		TaxonTest test = new TaxonTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
