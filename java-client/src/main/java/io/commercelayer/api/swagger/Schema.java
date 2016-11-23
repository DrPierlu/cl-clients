package io.commercelayer.api.swagger;

import java.util.ArrayList;
import java.util.List;

public class Schema {
	
	private List<Definition> definitions = new ArrayList<>();

	public List<Definition> getDefinitions() {
		return definitions;
	}

	public void setDefinitions(List<Definition> definitions) {
		this.definitions = definitions;
	}
	
	public void addDefinition(Definition definition) {
		this.definitions.add(definition);
	}

}
