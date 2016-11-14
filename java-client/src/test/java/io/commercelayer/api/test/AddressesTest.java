package io.commercelayer.api.test;

import org.junit.Assert;
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
		
		Address b = new AddressesCaller(token).insertAddress(a);
		
		Assert.assertNotNull(b);
		Assert.assertEquals(a.getGeocodingCity(), b.getGeocodingCity());
		
	}
	
	@Test
	public void updateAddressTest() throws ApiException {
		
		Address a = new Address();
		
		a.setId(1L);
		a.setGeocodingCity("Calenzano");
		a.setGeocodingCountry("IT");
		a.setGeocodingNumber("4");
		a.setGeocodingStreet("Via Nicolo' Paganini");
		a.setGeocodingZip("50041");
		
		new AddressesCaller(token).updateAddress(a);
		
	}
	
	@Test
	public void getAddressTest() throws ApiException {
		
		Address address = new AddressesCaller(token).getAddress(1L);
		
		Assert.assertNotNull(address);
		Assert.assertNotNull(address.getId());
		Assert.assertNotNull(address.getCreatedAt());
		
	}
	
//	@Test
//	public void getAddressListTest() throws ApiException {
//		List<Address> addresses = new AddressesCaller(token).getAddressList();
//	}
	
}
