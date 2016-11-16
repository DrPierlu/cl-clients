package io.commercelayer.api.test;

import java.util.ArrayList;
import java.util.List;

import io.commercelayer.api.model.Address;
import io.commercelayer.api.util.ApiUtils;

public class Test {

	public static void main(String[] args) {
		
		List<Address> list = new ArrayList<>();
		
		Address a1 = new Address();
		a1.setId(1L);
		a1.setGeocodingCity("Calenzano");
		a1.setGeocodingCountry("IT");
		a1.setGeocodingNumber("4");
		a1.setGeocodingStreet("Via Nicolo' Paganini");
		a1.setGeocodingZip("50041");
		list.add(a1);
		
		Address a2 = new Address();
		a2.setId(1L);
		a2.setGeocodingCity("Siena");
		a2.setGeocodingCountry("IT");
		a2.setGeocodingNumber("3");
		a2.setGeocodingStreet("Via delle Luglie");
		a2.setGeocodingZip("53100");
		list.add(a2);
		
		String j = ApiUtils.getJsonCodecInstance().toJSONList(list);
		
		System.out.println(j);
		
	}
	
}
