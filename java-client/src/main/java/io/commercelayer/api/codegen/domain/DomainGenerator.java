package io.commercelayer.api.codegen.domain;

import java.lang.reflect.Modifier;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.commercelayer.api.codegen.ApiCodegenException;
import io.commercelayer.api.codegen.CodegenConfig;
import io.commercelayer.api.codegen.model.Constructor;
import io.commercelayer.api.codegen.model.Field;
import io.commercelayer.api.codegen.model.Model;
import io.commercelayer.api.codegen.model.ModelClass;
import io.commercelayer.api.codegen.model.Type;
import io.commercelayer.api.codegen.source.ApiModelWriter;
import io.commercelayer.api.util.LogUtils;

public abstract class DomainGenerator {

	protected static final Logger logger = LoggerFactory.getLogger(CountryDomainGen.class);
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat(CodegenConfig.getProperty("model.comment.date.format"));
	

	abstract protected List<Item> getDomainCollection();
	
	abstract protected Class<?> getDomainClass();


	protected void generate() {
		writeModel(createModel());
	}

	
	private List<Item> checkDomainEntries(List<Item> list) {
		
		List<Item> newList = new ArrayList<>(list.size());
		
		Item last = null;
		int n = 2;
		for (Item i : list) {
			if ((last != null) && last.getName().equals(i.getName())) {
				i.setName(String.format("%s_%d", i.getName(), n++));
			}
			else {
				last = i;
				n = 2;
			}
			newList.add(i);
		}
		
		return newList;
		
	}

	private Model createModel() {

		List<Item> list = getDomainCollection();
		Collections.sort(list);
		
		list = checkDomainEntries(list);
		

		final Class<?> domainClass = getDomainClass();
		
		ModelClass mc = new ModelClass(domainClass.getPackage().getName(), domainClass.getSimpleName());
		mc.setModifier(Modifier.PUBLIC | Modifier.FINAL);
		mc.addCommentLine(mc.getName());
		mc.addCommentLine(String.format("[automatically generated on %s]", sdf.format(new Date())));
		
		mc.setLinesBefore(2);

		Constructor c = new Constructor(Modifier.PRIVATE);
		mc.addConstructor(c);

		int maxNameLength = 0;
		for (Item ci : list) {
			Field f = new Field(Modifier.PUBLIC | Modifier.STATIC | Modifier.FINAL, new Type(String.class), ci.getName());
			f.setInitialization(String.format("\"%s\"", ci.getCode()));
			maxNameLength = Math.max(maxNameLength, f.getName().length());
			mc.addField(f);
		}
		
		int numTabs = (maxNameLength / 4);
		for (Field f : mc.getFieldList()) f.setAligmentTabs(numTabs);

		Model model = new Model();
		model.addClass(mc);

		return model;

	}

	private void writeModel(Model model) {

		ApiModelWriter writer = new ApiModelWriter();

		try {
			writer.writeCode(model, false);
		}
		catch (ApiCodegenException e) {
			logger.error(LogUtils.printStackTrace(e));
		}

	}


	protected String itemName(String name) {

		String item = name;

		item = item.replaceAll("[ '-]", "_");
		item = item.replaceAll("[().,]", "");

		return item;

	}

	protected static class Item implements Comparable<Item> {

		private String code;
		private String name;


		public Item(String code, String name) {
			super();
			this.code = code;
			this.name = name;
		}


		public String getCode() {
			return code;
		}


		public void setCode(String code) {
			this.code = code;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		@Override
		public int compareTo(Item o) {
			return this.name.compareTo(o.name);
		}

	}

}
