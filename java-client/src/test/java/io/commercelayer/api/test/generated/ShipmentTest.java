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
	public ApiResponse<Shipment> testCreate(ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Shipment> testRead(Shipment res, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Shipment> testUpdate(Shipment oldRes, ApiCaller caller) {
		return null;
	}
	

	@Override
	public ApiResponse<Shipment> testDelete(Shipment res, ApiCaller caller) {
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
