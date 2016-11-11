package io.commercelayer.api.test;

import org.junit.Test;

import io.commercelayer.api.AddressesCaller;
import io.commercelayer.api.exception.ApiException;
import io.commercelayer.api.model.Address;

public class AddressesTest extends ApiTest {

	@Test
	public void insertAddressTest() throws ApiException {
		
		Address a = new Address();
		
		a.setGeocodingCity("Siena");
		a.setGeocodingCountry("IT");
		a.setGeocodingNumber("3");
		a.setGeocodingStreet("Via delle Luglie");
		a.setGeocodingZip("53100");
		
		new AddressesCaller(token).insertAddress(a);
		
	}
	
//	@Test
//	public void getAddressTest() throws ApiException {
//		
//		Address address = new AddressesCaller(token).getAddress("1");
//		
//		System.out.println(address);
//		
//	}
	
//	@Test
//	public void getAddressListTest() throws ApiException {
//		List<Address> addresses = new AddressesCaller(token).getAddressList();
//	}
	
}
