package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Shipment;
import io.commercelayer.api.test.common.IntegrationTest;


/**
 * ShipmentTest
 */
public class ShipmentTest extends IntegrationTest<Shipment> {

	@Override
	public ApiResponse<Shipment> crudCreateTest(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Shipment> crudReadTest(Shipment res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Shipment> crudUpdateTest(Shipment oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Shipment> crudDeleteTest(Shipment res, ApiCaller caller) {
		return null;
	}
	

	public static void main(String[] args) {
	
		ShipmentTest test = new ShipmentTest();
	
		test.runTest();
	
		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();
	
	}
	
}
