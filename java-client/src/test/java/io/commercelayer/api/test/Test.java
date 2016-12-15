package io.commercelayer.api.test;

import io.commercelayer.api.model.common.ApiResource;

public class Test {

	public static void main(String[] args) {
		
		Class<?> c = ApiResource.class;
		
		System.out.println(c.getDeclaredFields());
		
	}
	
}
