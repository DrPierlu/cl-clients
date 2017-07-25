package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Variant;
import io.commercelayer.api.operation.DeleteAccountVariantsId;
import io.commercelayer.api.operation.GetAccountVariantsId;
import io.commercelayer.api.operation.PostAccountVariants;
import io.commercelayer.api.operation.PutAccountVariantsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * VariantTest
 */
public class VariantTest extends IntegrationTest<Variant> {

	@Override
	public ApiResponse<Variant> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostAccountVariants postOp = ApiOperations.PostAccountVariants();
	
		Variant res = new Variant();
	
		// FIELD NOT FOUND -> res.setContentFieldIds("contentFieldIds");
		// FIELD NOT FOUND -> res.setProductId("productId");
		// FIELD NOT FOUND -> res.setLineItemIds("lineItemIds");
		// FIELD NOT FOUND -> res.setResourceImageIds("resourceImageIds");
		// FIELD NOT FOUND -> res.setOptionValueIds("optionValueIds");
		// FIELD NOT FOUND -> res.setTaxCode("taxCode");
		// FIELD NOT FOUND -> res.setMetaFieldIds("metaFieldIds");
		// FIELD NOT FOUND -> res.setVariantOptionIds("variantOptionIds");
		// FIELD NOT FOUND -> res.setPriceIds("priceIds");
		// FIELD NOT FOUND -> res.setShippingServiceStockLocationIds("shippingServiceStockLocationIds");
		// FIELD NOT FOUND -> res.setResourceMetaFieldIds("resourceMetaFieldIds");
		// FIELD NOT FOUND -> res.setStockItemIds("stockItemIds");
		res.setSku("sku");
		// FIELD NOT FOUND -> res.setTrackInventory("trackInventory");
		// FIELD NOT FOUND -> res.setImageIds("imageIds");
		// FIELD NOT FOUND -> res.setResourceContentFieldIds("resourceContentFieldIds");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostAccountVariants> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Variant> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getContentFieldIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getProductId());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getLineItemIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getResourceImageIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getOptionValueIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getTaxCode());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getMetaFieldIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getVariantOptionIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getPriceIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getShippingServiceStockLocationIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getResourceMetaFieldIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getStockItemIds());
		Assert.assertNotNull(postRes.getResource().getSku());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getTrackInventory());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getImageIds());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getResourceContentFieldIds());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Variant> crudReadTest(Variant res, ApiCaller caller) {
	
		// GET
	
		GetAccountVariantsId getOp = ApiOperations.GetAccountVariantsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetAccountVariantsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Variant> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Variant> crudUpdateTest(Variant oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountVariantsId putOp = ApiOperations.PutAccountVariantsId();
		putOp.setId(oldRes.getId());
	
		Variant res = new Variant();
	
		// FIELD NOT FOUND -> res.setContentFieldIds(randomField(oldRes.getContentFieldIds()));
		// FIELD NOT FOUND -> res.setProductId(randomField(oldRes.getProductId()));
		// FIELD NOT FOUND -> res.setLineItemIds(randomField(oldRes.getLineItemIds()));
		// FIELD NOT FOUND -> res.setResourceImageIds(randomField(oldRes.getResourceImageIds()));
		// FIELD NOT FOUND -> res.setOptionValueIds(randomField(oldRes.getOptionValueIds()));
		// FIELD NOT FOUND -> res.setTaxCode(randomField(oldRes.getTaxCode()));
		// FIELD NOT FOUND -> res.setMetaFieldIds(randomField(oldRes.getMetaFieldIds()));
		// FIELD NOT FOUND -> res.setVariantOptionIds(randomField(oldRes.getVariantOptionIds()));
		// FIELD NOT FOUND -> res.setPriceIds(randomField(oldRes.getPriceIds()));
		// FIELD NOT FOUND -> res.setShippingServiceStockLocationIds(randomField(oldRes.getShippingServiceStockLocationIds()));
		// FIELD NOT FOUND -> res.setResourceMetaFieldIds(randomField(oldRes.getResourceMetaFieldIds()));
		// FIELD NOT FOUND -> res.setStockItemIds(randomField(oldRes.getStockItemIds()));
		res.setSku(randomField(oldRes.getSku()));
		// FIELD NOT FOUND -> res.setTrackInventory(randomField(oldRes.getTrackInventory()));
		// FIELD NOT FOUND -> res.setImageIds(randomField(oldRes.getImageIds()));
		// FIELD NOT FOUND -> res.setResourceContentFieldIds(randomField(oldRes.getResourceContentFieldIds()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountVariantsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Variant> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getContentFieldIds(), putRes.getResource().getContentFieldIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getProductId(), putRes.getResource().getProductId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getLineItemIds(), putRes.getResource().getLineItemIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getResourceImageIds(), putRes.getResource().getResourceImageIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getOptionValueIds(), putRes.getResource().getOptionValueIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getTaxCode(), putRes.getResource().getTaxCode());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getMetaFieldIds(), putRes.getResource().getMetaFieldIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getVariantOptionIds(), putRes.getResource().getVariantOptionIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPriceIds(), putRes.getResource().getPriceIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShippingServiceStockLocationIds(), putRes.getResource().getShippingServiceStockLocationIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getResourceMetaFieldIds(), putRes.getResource().getResourceMetaFieldIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getStockItemIds(), putRes.getResource().getStockItemIds());
		Assert.assertNotEquals(oldRes.getSku(), putRes.getResource().getSku());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getTrackInventory(), putRes.getResource().getTrackInventory());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getImageIds(), putRes.getResource().getImageIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getResourceContentFieldIds(), putRes.getResource().getResourceContentFieldIds());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<Variant> crudDeleteTest(Variant res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountVariantsId delOp = ApiOperations.DeleteAccountVariantsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountVariantsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<Variant> delRes = test(delReq, caller);
	
		// GET
	
		GetAccountVariantsId getOp = ApiOperations.GetAccountVariantsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetAccountVariantsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Variant> getRes = null;
	
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
	
		VariantTest test = new VariantTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
