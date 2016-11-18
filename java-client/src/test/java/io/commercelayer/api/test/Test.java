package io.commercelayer.api.test;

import io.commercelayer.api.json.JsonCodec;
import io.commercelayer.api.json.JsonCodecFactory;
import io.commercelayer.api.model.Address;

public class Test {

	public static void main(String[] args) {
		
//		List<Address> list = new ArrayList<>();
//		
//		Address a1 = new Address();
//		a1.setId(1L);
//		a1.setGeocodingCity("Calenzano");
//		a1.setGeocodingCountry("IT");
//		a1.setGeocodingNumber("4");
//		a1.setGeocodingStreet("Via Nicolo' Paganini");
//		a1.setGeocodingZip("50041");
//		list.add(a1);
//		
//		Address a2 = new Address();
//		a2.setId(1L);
//		a2.setGeocodingCity("Siena");
//		a2.setGeocodingCountry("IT");
//		a2.setGeocodingNumber("3");
//		a2.setGeocodingStreet("Via delle Luglie");
//		a2.setGeocodingZip("53100");
//		list.add(a2);
//		
//		String j = ApiUtils.getJsonCodecInstance().toJSONList(list);
//		
//		System.out.println(j);
		
		String json = "{\"resource_name\":\"address\",\"id\":1,\"environment_id\":3,\"geocoding_country\":\"IT\",\"geocoding_zip\":\"50041\",\"geocoding_city\":\"Calenzano\",\"geocoding_street\":\"Via Nicolo' Paganini\",\"geocoding_number\":\"4\",\"provider\":\"google\",\"place_id\":\"ChIJbzYPovz3KhMRmAgYoOyLWkY\",\"precision\":\"building\",\"accuracy\":9,\"country_code\":\"IT\",\"country\":\"Italy\",\"state_code\":\"Toscana\",\"state_name\":\"Toscana\",\"state\":\"Toscana\",\"province\":\"Toscana\",\"zip\":\"50041\",\"city\":\"Calenzano\",\"district\":\"Città Metropolitana di Firenze\",\"street_name\":\"Via Niccolò Paganini\",\"street_number\":\"4\",\"street_address\":\"4 Via Niccolò Paganini\",\"sub_premise\":null,\"full_address\":\"Via Niccolò Paganini, 4, 50041 Calenzano FI, Italy\",\"formatted_address\":\"Via Niccolò Paganini, 4, 50041 Calenzano FI, Italy\",\"lat\":\"43.857839\",\"lng\":\"11.1518029\",\"suggested_bounds_sw_lat\":\"43.8564900197085\",\"suggested_bounds_sw_lng\":\"11.1504539197085\",\"suggested_bounds_ne_lat\":\"43.8591879802915\",\"suggested_bounds_ne_lng\":\"11.1531518802915\",\"creator_id\":3,\"creator_resource\":\"user\",\"created_at\":\"2016-11-11T17:23:35.283Z\",\"updated_at\":\"2016-11-17T07:34:51.638Z\",\"expanded\":{}}";
		
		JsonCodec jc = JsonCodecFactory.getJsonCodecInstance();
		
		System.out.println(jc.toJSON(jc.fromJSON(json, Address.class), false));
		
	}
	
}
