package io.commercelayer.api.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import io.commercelayer.api.AddressesCaller;
import io.commercelayer.api.exception.ApiException;
import io.commercelayer.api.model.Address;
import io.commercelayer.api.search.ApiSearchRequest;
import io.commercelayer.api.search.ApiSearchResponse;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AddressesTest extends ApiTest {

	// @Test
	public void _01_insertAddressTest() throws ApiException {
		
		Address a = new Address();
		
		a.setGeocodingCity("Siena");
		a.setGeocodingCountry("IT");
		a.setGeocodingNumber("3");
		a.setGeocodingStreet("Via delle Luglie");
		a.setGeocodingZip("53100");
		
		Address b = new AddressesCaller(token).insertAddress(a);
		
		assertNotNull(b);
		assertEquals(a.getGeocodingCity(), b.getGeocodingCity());
		
	}
	
	// @Test
	public void _03_updateAddressTest() throws ApiException {
		
		Address a = new Address();
		
		a.setId(1L);
		a.setGeocodingCity("Calenzano");
		a.setGeocodingCountry("IT");
		a.setGeocodingNumber("4");
		a.setGeocodingStreet("Via Nicolo' Paganini");
		a.setGeocodingZip("50041");
		
		new AddressesCaller(token).updateAddress(a);
		
	}
	
	// @Test
	public void _02_getAddressTest() throws ApiException {
		
		Address address = new AddressesCaller(token).getAddress(1L);
		
		assertNotNull(address);
		assertNotNull(address.getId());
		assertNotNull(address.getCreatedAt());
		
	}
	

	// @Test
	public void _04_getAddressListTest() throws ApiException {
		
		ApiSearchRequest request = new ApiSearchRequest();
		
		ApiSearchResponse<Address> response = new AddressesCaller(token).getAddressList(request);
		
		List<Address> addresses = response.getItemList();
		
		assertNotNull(addresses);
		assertTrue(addresses.size() > 0);
		
	}

	
	@Override
	public void runTest() throws ApiException {
		
		AddressesCaller caller = new AddressesCaller(token);
		
		// INSERT
		Address a = new Address();
		
		a.setGeocodingCity("Siena");
		a.setGeocodingCountry("IT");
		a.setGeocodingNumber("3");
		a.setGeocodingStreet("Via delle Luglie");
		a.setGeocodingZip("53100");
		
		Address b = caller.insertAddress(a);
		
		assertNotNull(b);
		assertNotNull(b.getId());
		assertEquals(a.getGeocodingCity(), b.getGeocodingCity());
		
		b.setId(1L);
		// GET
		Address address = caller.getAddress(b.getId());
		
		assertNotNull(address);
		assertNotNull(address.getId());
		assertNotNull(address.getCreatedAt());
		assertEquals(b.getId(), address.getId());
		
		
		// UPDATE
		Address c = new Address();
		
		c.setId(address.getId());
		c.setGeocodingCity("Calenzano");
		c.setGeocodingCountry("IT");
		c.setGeocodingNumber("4");
		c.setGeocodingStreet("Via Nicolo' Paganini");
		c.setGeocodingZip("50041");
		
		caller.updateAddress(c);
		
		address = caller.getAddress(c.getId());
		
		assertNotNull(address);
		assertEquals(c.getId(), address.getId());
		
		
		// GET LIST
		ApiSearchRequest request = new ApiSearchRequest();
		
		ApiSearchResponse<Address> response = caller.getAddressList(request);
		
		List<Address> addresses = response.getItemList();
		
		assertNotNull(addresses);
		assertTrue(addresses.size() > 0);
		
		
		// DELETE
		caller.deleteAddress(c.getId());
		
		address = caller.getAddress(c.getId());
		
		assertTrue(address == null);
		
	}
	
}
