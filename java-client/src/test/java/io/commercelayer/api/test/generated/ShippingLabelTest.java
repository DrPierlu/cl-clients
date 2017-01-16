package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.ShippingLabel;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * ShippingLabelTest
 */
public class ShippingLabelTest extends IntegrationTest<ShippingLabel> {

	@Override
	public ApiResponse<ShippingLabel> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingLabel> testRead(ShippingLabel res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingLabel> testUpdate(ShippingLabel oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<ShippingLabel> testDelete(ShippingLabel res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		ShippingLabelTest test = new ShippingLabelTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
