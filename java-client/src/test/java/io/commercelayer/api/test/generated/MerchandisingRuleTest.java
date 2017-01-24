package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.MerchandisingRule;
import io.commercelayer.api.operation.DeleteAccountMerchandisingRulesId;
import io.commercelayer.api.operation.GetAccountMerchandisingRulesId;
import io.commercelayer.api.operation.PostAccountMerchandisingRules;
import io.commercelayer.api.operation.PutAccountMerchandisingRulesId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * MerchandisingRuleTest
 */
public class MerchandisingRuleTest extends IntegrationTest<MerchandisingRule> {

	@Override
	public ApiResponse<MerchandisingRule> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountMerchandisingRules postOp = ApiOperations.PostAccountMerchandisingRules();
	
		MerchandisingRule res = new MerchandisingRule();
	
		// FIELD NOT FOUND -> res.setCatalogId("catalogId");
		// FIELD NOT FOUND -> res.setProductId("productId");
		// FIELD TYPE MISMATCH -> res.setHero("hero");
		// FIELD TYPE MISMATCH -> res.setPosition("position");
		// FIELD NOT FOUND -> res.setTaxonId("taxonId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountMerchandisingRules> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<MerchandisingRule> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getCatalogId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getProductId());
		// FIELD TYPE MISMATCH -> Assert.assertNotNull(postRes.getResource().getHero());
		// FIELD TYPE MISMATCH -> Assert.assertNotNull(postRes.getResource().getPosition());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getTaxonId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<MerchandisingRule> crudReadTest(MerchandisingRule res, ApiCaller caller) {
	
		// GET
	
		GetAccountMerchandisingRulesId getOp = ApiOperations.GetAccountMerchandisingRulesId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountMerchandisingRulesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<MerchandisingRule> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<MerchandisingRule> crudUpdateTest(MerchandisingRule oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountMerchandisingRulesId putOp = ApiOperations.PutAccountMerchandisingRulesId();
		putOp.setId(oldRes.getId());
	
		MerchandisingRule res = new MerchandisingRule();
	
		// FIELD NOT FOUND -> res.setCatalogId(randomField(oldRes.getCatalogId()));
		// FIELD NOT FOUND -> res.setProductId(randomField(oldRes.getProductId()));
		// FIELD TYPE MISMATCH -> res.setHero(randomField(oldRes.getHero()));
		// FIELD TYPE MISMATCH -> res.setPosition(randomField(oldRes.getPosition()));
		// FIELD NOT FOUND -> res.setTaxonId(randomField(oldRes.getTaxonId()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountMerchandisingRulesId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<MerchandisingRule> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getCatalogId(), putRes.getResource().getCatalogId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getProductId(), putRes.getResource().getProductId());
		// FIELD TYPE MISMATCH -> Assert.assertNotEquals(oldRes.getHero(), putRes.getResource().getHero());
		// FIELD TYPE MISMATCH -> Assert.assertNotEquals(oldRes.getPosition(), putRes.getResource().getPosition());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getTaxonId(), putRes.getResource().getTaxonId());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<MerchandisingRule> crudDeleteTest(MerchandisingRule res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountMerchandisingRulesId delOp = ApiOperations.DeleteAccountMerchandisingRulesId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountMerchandisingRulesId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<MerchandisingRule> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountMerchandisingRulesId getOp = ApiOperations.GetAccountMerchandisingRulesId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountMerchandisingRulesId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<MerchandisingRule> getRes = null;
	
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
	
		MerchandisingRuleTest test = new MerchandisingRuleTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
