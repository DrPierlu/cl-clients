package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Catalog;
import io.commercelayer.api.operation.DeleteAccountCatalogsId;
import io.commercelayer.api.operation.GetAccountCatalogsId;
import io.commercelayer.api.operation.PostAccountCatalogs;
import io.commercelayer.api.operation.PutAccountCatalogsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * CatalogTest
 */
public class CatalogTest extends IntegrationTest<Catalog> {

	@Override
	public ApiResponse<Catalog> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountCatalogs postOp = ApiOperations.PostAccountCatalogs();
	
		Catalog res = new Catalog();
	
		res.setName("name");
		// FIELD NOT FOUND -> res.setDescription("description");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountCatalogs> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Catalog> postRes = test(postReq, caller);
	
	
		Assert.assertNotNull(postRes.getResource().getName());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getDescription());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Catalog> crudReadTest(Catalog res, ApiCaller caller) {
	
		// GET
	
		GetAccountCatalogsId getOp = ApiOperations.GetAccountCatalogsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountCatalogsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Catalog> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Catalog> crudUpdateTest(Catalog oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountCatalogsId putOp = ApiOperations.PutAccountCatalogsId();
		putOp.setId(oldRes.getId());
	
		Catalog res = new Catalog();
	
		res.setName(randomField(oldRes.getName()));
		// FIELD NOT FOUND -> res.setDescription(randomField(oldRes.getDescription()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountCatalogsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Catalog> putRes = test(putReq, caller);
	
	
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getDescription(), putRes.getResource().getDescription());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<Catalog> crudDeleteTest(Catalog res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountCatalogsId delOp = ApiOperations.DeleteAccountCatalogsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountCatalogsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<Catalog> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountCatalogsId getOp = ApiOperations.GetAccountCatalogsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountCatalogsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Catalog> getRes = null;
	
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
	
		CatalogTest test = new CatalogTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
