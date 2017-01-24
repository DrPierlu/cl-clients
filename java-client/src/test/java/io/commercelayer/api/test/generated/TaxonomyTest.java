package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Taxonomy;
import io.commercelayer.api.operation.DeleteAccountTaxonomiesId;
import io.commercelayer.api.operation.GetAccountTaxonomiesId;
import io.commercelayer.api.operation.PostAccountTaxonomies;
import io.commercelayer.api.operation.PutAccountTaxonomiesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * TaxonomyTest
 */
public class TaxonomyTest extends IntegrationTest<Taxonomy> {

	@Override
	public ApiResponse<Taxonomy> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountTaxonomies postOp = ApiOperations.PostAccountTaxonomies();
	
		Taxonomy res = new Taxonomy();
	
		res.setName("name");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountTaxonomies> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Taxonomy> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getName());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Taxonomy> crudReadTest(Taxonomy res, ApiCaller caller) {
	
		// GET
	
		GetAccountTaxonomiesId getOp = ApiOperations.GetAccountTaxonomiesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountTaxonomiesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Taxonomy> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Taxonomy> crudUpdateTest(Taxonomy oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountTaxonomiesId putOp = ApiOperations.PutAccountTaxonomiesId();
		putOp.setId(oldRes.getId());
	
		Taxonomy res = new Taxonomy();
	
		res.setName(randomField(oldRes.getName()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountTaxonomiesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Taxonomy> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<Taxonomy> crudDeleteTest(Taxonomy res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountTaxonomiesId delOp = ApiOperations.DeleteAccountTaxonomiesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountTaxonomiesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<Taxonomy> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountTaxonomiesId getOp = ApiOperations.GetAccountTaxonomiesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountTaxonomiesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Taxonomy> getRes = null;
	
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
	
		TaxonomyTest test = new TaxonomyTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
