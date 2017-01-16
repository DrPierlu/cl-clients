package io.commercelayer.api.codegen.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import io.commercelayer.api.domain.Country;

public class CountryDomainGen extends DomainGenerator {

	@Override
	protected List<Item> getDomainCollection() {

		String[] countryCodes = Locale.getISOCountries();

		List<Item> list = new ArrayList<>(countryCodes.length);

		for (String cc : countryCodes) {
			String name = new Locale("", cc).getDisplayCountry(Locale.ENGLISH).toUpperCase();
			name = itemName(name);
			list.add(new DomainGenerator.Item(cc.toUpperCase(), name));
		}

		return list;

	}


	@Override
	protected Class<?> getDomainClass() {
		return Country.class;
	}
	
	
	public static void main(String[] args) {
		new CountryDomainGen().generate();
	}

}
