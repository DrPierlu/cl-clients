package io.commercelayer.api.codegen.schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Schema {

	private Map<String, Definition> definitions = new TreeMap<>();
	private List<Resource> resources = new ArrayList<>();

	

	public Map<String, Definition> getDefinitions() {
		return definitions;
	}

	public void setDefinitions(Map<String, Definition> definitions) {
		this.definitions = definitions;
	}

	public void addDefinition(Definition definition) {
		this.definitions.put(definition.getTitle(), definition);
	}

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public void addResource(Resource resource) {
		this.resources.add(resource);
	}

}
