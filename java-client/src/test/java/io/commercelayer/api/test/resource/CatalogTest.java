package io.commercelayer.api.test.resource;

import org.junit.Assert;

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

/**
 * CatalogTest
 */
public class CatalogTest extends IntegrationTest<Catalog> {

	@Override
	public ApiResponse<Catalog> testCreate(ApiCaller caller) {
		
		// POST

		PostAccountCatalogs postOp = ApiOperations.PostAccountCatalogs();

		Catalog a = new Catalog();

		a.setName(randomField("Catalog"));

		postOp.setPayload(a);

		ApiRequest<PostAccountCatalogs> postReq = new ApiRequest<>(postOp);
		ApiResponse<Catalog> postRes = test(postReq, Catalog.class, caller);

		Assert.assertNotNull(postRes.getResource().getId());

		return postRes;
		
	}
	

	@Override
	public ApiResponse<Catalog> testRead(Catalog res, ApiCaller caller) {
		
		// GET

		GetAccountCatalogsId getOp = ApiOperations.GetAccountCatalogsId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountCatalogsId> getReq = new ApiRequest<>(getOp);

		ApiResponse<Catalog> getRes = test(getReq, Catalog.class, caller);

		Assert.assertNotNull(getRes.getResource().getName());

		return getRes;
		
	}
	

	@Override
	public ApiResponse<Catalog> testUpdate(Catalog oldRes, ApiCaller caller) {
		
		// PUT

		PutAccountCatalogsId putOp = ApiOperations.PutAccountCatalogsId();
		putOp.setId(oldRes.getId());

		Catalog a = new Catalog();

		a.setName(randomField(oldRes.getName()));

		putOp.setPayload(a);

		ApiRequest<PutAccountCatalogsId> putReq = new ApiRequest<>(putOp);
		ApiResponse<Catalog> putRes = test(putReq, Catalog.class, caller);

		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());

		return putRes;
		
	}
	

	@Override
	public ApiResponse<Catalog> testDelete(Catalog res, ApiCaller caller) {
		
		// DELETE

		DeleteAccountCatalogsId delOp = ApiOperations.DeleteAccountCatalogsId();
		delOp.setId(res.getId());

		ApiRequest<DeleteAccountCatalogsId> delReq = new ApiRequest<>(delOp);

		ApiResponse<Catalog> delRes = test(delReq, caller);

		// GET

		GetAccountCatalogsId getOp = ApiOperations.GetAccountCatalogsId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountCatalogsId> getReq = new ApiRequest<>(getOp);

		ApiResponse<Catalog> getRes = test(getReq, Catalog.class, caller, false);

		Assert.assertNull(getRes.getResource());
		Assert.assertNotNull(getRes.getApiError());

		return delRes;
		
	}
	

	public static void main(String[] args) {
	
		CatalogTest test = new CatalogTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
