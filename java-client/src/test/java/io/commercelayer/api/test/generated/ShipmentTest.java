package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Shipment;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;


/**
 * ShipmentTest
 */
public class ShipmentTest extends IntegrationTest<Shipment> {

	@Override
	public ApiResponse<Shipment> testCreate(ApiCaller caller) {
		throw new TestException("ShipmentTest.testCreate not implemented");
	}
	

	@Override
	public ApiResponse<Shipment> testRead(Shipment res, ApiCaller caller) {
		throw new TestException("ShipmentTest.testRead not implemented");
	}
	

	@Override
	public ApiResponse<Shipment> testUpdate(Shipment oldRes, ApiCaller caller) {
		throw new TestException("ShipmentTest.testUpdate not implemented");
	}
	

	@Override
	public ApiResponse<Shipment> testDelete(Shipment res, ApiCaller caller) {
		throw new TestException("ShipmentTest.testDelete not implemented");
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
