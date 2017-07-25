package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Product;
import io.commercelayer.api.operation.DeleteAccountProductsId;
import io.commercelayer.api.operation.GetChannelProductsId;
import io.commercelayer.api.operation.PostChannelProducts;
import io.commercelayer.api.operation.PutAccountProductsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * ProductTest
 */
public class ProductTest extends IntegrationTest<Product> {

	@Override
	public ApiResponse<Product> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostChannelProducts postOp = ApiOperations.PostChannelProducts();
	
		Product res = new Product();
	
		/* No payload data */
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostChannelProducts> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Product> postRes = test(postReq, caller);
	
	
		/* No test assertions */
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Product> crudReadTest(Product res, ApiCaller caller) {
	
		// GET
	
		GetChannelProductsId getOp = ApiOperations.GetChannelProductsId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetChannelProductsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Product> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Product> crudUpdateTest(Product oldRes, ApiCaller caller) {
	
		// PUT
	
		PutAccountProductsId putOp = ApiOperations.PutAccountProductsId();
		putOp.setId(oldRes.getId());
	
		Product res = new Product();
	
		// FIELD NOT FOUND -> res.setContentFieldIds(randomField(oldRes.getContentFieldIds()));
		// FIELD NOT FOUND -> res.setPropertyValueIds(randomField(oldRes.getPropertyValueIds()));
		// FIELD NOT FOUND -> res.setLineItemIds(randomField(oldRes.getLineItemIds()));
		// FIELD NOT FOUND -> res.setResourceImageIds(randomField(oldRes.getResourceImageIds()));
		res.setDescription(randomField(oldRes.getDescription()));
		// FIELD NOT FOUND -> res.setTaxCode(randomField(oldRes.getTaxCode()));
		// FIELD NOT FOUND -> res.setProductTypeId(randomField(oldRes.getProductTypeId()));
		// FIELD NOT FOUND -> res.setMetaFieldIds(randomField(oldRes.getMetaFieldIds()));
		// FIELD NOT FOUND -> res.setVariantIds(randomField(oldRes.getVariantIds()));
		// FIELD NOT FOUND -> res.setMerchandisingRuleIds(randomField(oldRes.getMerchandisingRuleIds()));
		// FIELD NOT FOUND -> res.setPriceIds(randomField(oldRes.getPriceIds()));
		res.setName(randomField(oldRes.getName()));
		// FIELD NOT FOUND -> res.setShippingServiceStockLocationIds(randomField(oldRes.getShippingServiceStockLocationIds()));
		// FIELD NOT FOUND -> res.setResourceMetaFieldIds(randomField(oldRes.getResourceMetaFieldIds()));
		// FIELD NOT FOUND -> res.setStockItemIds(randomField(oldRes.getStockItemIds()));
		// FIELD NOT FOUND -> res.setTrackInventory(randomField(oldRes.getTrackInventory()));
		// FIELD NOT FOUND -> res.setProductPropertyIds(randomField(oldRes.getProductPropertyIds()));
		// FIELD NOT FOUND -> res.setImageIds(randomField(oldRes.getImageIds()));
		// FIELD NOT FOUND -> res.setResourceContentFieldIds(randomField(oldRes.getResourceContentFieldIds()));
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutAccountProductsId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Product> putRes = test(putReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getContentFieldIds(), putRes.getResource().getContentFieldIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPropertyValueIds(), putRes.getResource().getPropertyValueIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getLineItemIds(), putRes.getResource().getLineItemIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getResourceImageIds(), putRes.getResource().getResourceImageIds());
		Assert.assertNotEquals(oldRes.getDescription(), putRes.getResource().getDescription());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getTaxCode(), putRes.getResource().getTaxCode());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getProductTypeId(), putRes.getResource().getProductTypeId());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getMetaFieldIds(), putRes.getResource().getMetaFieldIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getVariantIds(), putRes.getResource().getVariantIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getMerchandisingRuleIds(), putRes.getResource().getMerchandisingRuleIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getPriceIds(), putRes.getResource().getPriceIds());
		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getShippingServiceStockLocationIds(), putRes.getResource().getShippingServiceStockLocationIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getResourceMetaFieldIds(), putRes.getResource().getResourceMetaFieldIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getStockItemIds(), putRes.getResource().getStockItemIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getTrackInventory(), putRes.getResource().getTrackInventory());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getProductPropertyIds(), putRes.getResource().getProductPropertyIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getImageIds(), putRes.getResource().getImageIds());
		// FIELD NOT FOUND -> Assert.assertNotEquals(oldRes.getResourceContentFieldIds(), putRes.getResource().getResourceContentFieldIds());
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<Product> crudDeleteTest(Product res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountProductsId delOp = ApiOperations.DeleteAccountProductsId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountProductsId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<Product> delRes = test(delReq, caller);
	
		// GET
	
		GetChannelProductsId getOp = ApiOperations.GetChannelProductsId();
		getOp.setId(res.getId());
	
		ApiRequest<GetChannelProductsId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Product> getRes = null;
	
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
	
		ProductTest test = new ProductTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
