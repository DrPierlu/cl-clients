package io.commercelayer.api.codegen.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import io.commercelayer.api.domain.Language;

public class LanguageDomainGen extends DomainGenerator {

	@Override
	protected List<Item> getDomainCollection() {

		String[] isoLanguages = Locale.getISOLanguages();

		List<Item> list = new ArrayList<>(isoLanguages.length);

		for (String il : isoLanguages) {
			String name = new Locale(il).getDisplayLanguage(Locale.ENGLISH).toUpperCase();
			name = itemName(name);
			list.add(new DomainGenerator.Item(il.toUpperCase(), name));
		}

		return list;

	}


	@Override
	protected Class<?> getDomainClass() {
		return Language.class;
	}
	
	
	public static void main(String[] args) {
		new LanguageDomainGen().generate();
	}

}
